package com.cubic.patient.services.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cubic.patient.entity.PatientAddressEntity;
import com.cubic.patient.entity.PatientAllergyEntity;
import com.cubic.patient.entity.PatientInfoEntity;
import com.cubic.patient.exception.PatientAlreadyExists;
import com.cubic.patient.exception.PatientNotFoundException;
import com.cubic.patient.repo.PatientInfoRepo;
import com.cubic.patient.services.PatientAddressService;
import com.cubic.patient.services.PatientAllergyService;
import com.cubic.patient.services.PatientInfoService;
import com.cubic.patient.services.validations.Validations;
import com.cubic.patient.vo.Address;
import com.cubic.patient.vo.Allergy;
import com.cubic.patient.vo.Patient;
import com.cubic.patient.vo.PatientInfo;

@Service
@Transactional
public class PatientInfoServiceImpl implements PatientInfoService {
	private static Logger logger = LoggerFactory.getLogger(PatientInfoServiceImpl.class);
	
	@Autowired
	private Validations validate;
	
	@Autowired
	private PatientInfoRepo piRepo;

	@Autowired
	private PatientAddressService addSer;

	@Autowired
	private PatientAllergyService algSer;

	@Autowired
	private MapperPatient mapper;
	
	public String createPatientInfo(Patient patient) {
		
		PatientInfo patientinfo = patient.getPatientinfo();

		validate.validateInfo(patientinfo);
		checkAvailability(patientinfo);

		PatientInfoEntity patientInfoEntity = mapper.mapToPatientEntity(new PatientInfoEntity(), patientinfo);
		patientInfoEntity.setPatientPk(UUID.randomUUID().toString());
		patientInfoEntity.setPatientId(piRepo.getPatientID());
		patientInfoEntity.setDob(validate.stringToDate(patientinfo.getDob()));
		patientInfoEntity.setCreatedDate(validate.getCurrentDate());

		List<Address> addressList = patient.getAddress();
		List<PatientAddressEntity> address = addSer.createPatientAddress(addressList);
		for (PatientAddressEntity ad : address) {
			patientInfoEntity.getPatientAddressList().add(ad);
			ad.setPatientAddressFk(patientInfoEntity);
		}

		List<Allergy> allergyList = patient.getAllergy();
		List<PatientAllergyEntity> allergy = algSer.createPatientAllergy(allergyList);
		for (PatientAllergyEntity al : allergy) {
			patientInfoEntity.getPatientAllergyList().add(al);
			al.setPatientAllergyFk(patientInfoEntity);
		}

		piRepo.save(patientInfoEntity);
		return patientInfoEntity.getPatientPk().toString();
	}

	public void modifyPatientInfo(PatientInfo patientinfo) {
		
		validate.validateInfo(patientinfo);
		editCheckAvailability(patientinfo);
		
		logger.debug("Entering PatientInfo Modify");
		PatientInfoEntity entity = piRepo.findOne(patientinfo.getPk());
		if (entity == null) {
			throw new PatientNotFoundException("Patient not found with that id");
		}
		entity = mapper.mapToPatientEntity(entity, patientinfo);
		entity.setDob(validate.stringToDate(patientinfo.getDob()));
		entity.setCreatedDate(validate.getCurrentDate());
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Patient findPatientInfo(String id) {
		Patient patient = new Patient();
		PatientInfoEntity entity = piRepo.findOne(id);
		if (entity == null) {
			throw new PatientNotFoundException("Patient not found with that id");
		}
		String dob = validate.dateToString(entity.getDob());
		PatientInfo info = mapper.mapToPatientInfo(entity);
		info.setDob(dob);
		patient.setPatientinfo(info);

		List<Address> address = addSer.findPatientAddress(entity.getPatientAddressList());
		patient.setAddress(address);

		List<Allergy> allergy = algSer.findPatientAllergy(entity.getPatientAllergyList());
		patient.setAllergy(allergy);

		return patient;
	}

	public void checkAvailability(final PatientInfo patientInfo) {
		String firstname = patientInfo.getFirstname();
		String ssn = patientInfo.getSsn();
		ssn = ssn.substring(Math.max(0, ssn.length() - 4));
		String gender = patientInfo.getGender();
		Date dob = validate.stringToDate(patientInfo.getDob());
		Long check = piRepo.checkAvailability(firstname, ssn, gender);
		if (check > 0) {
			throw new PatientAlreadyExists("Patient Already Exists in Record");
		}
	}
	
	public void editCheckAvailability(final PatientInfo patientInfo) {
		String id = patientInfo.getPk();
		String firstname = patientInfo.getFirstname();
		String ssn = patientInfo.getSsn();
		ssn = ssn.substring(Math.max(0, ssn.length() - 4));
		String gender = patientInfo.getGender();
		Long check = piRepo.editCheckAvailability(firstname, ssn, gender,id);
		if (check > 0) {
			throw new PatientAlreadyExists("Duplicate Patient Entry in Record");
		}
	}
}
