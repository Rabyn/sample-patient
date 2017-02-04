package com.cubic.patient.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cubic.patient.entity.PatientAddressEntity;
import com.cubic.patient.entity.PatientInfoEntity;
import com.cubic.patient.exception.PatientNotFoundException;
import com.cubic.patient.repo.PatientInfoRepo;
import com.cubic.patient.services.PatientSearchService;
import com.cubic.patient.services.validations.Validations;
import com.cubic.patient.vo.AddressType;
import com.cubic.patient.vo.PatientSearch;

@Service
@Transactional
public class PatientSearchServiceImpl implements PatientSearchService {
	
	@Autowired
	private Validations validate;
	
	@Autowired
	private PatientInfoRepo piRepo;
	
	@Autowired
	private MapperSearch mapper;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public PatientSearch searchById(Long id) {
		PatientInfoEntity entity = piRepo.searchPatientById(id);
		if (entity == null) {
			throw new PatientNotFoundException("Patient not found with that id");
		}
		String dob = validate.dateToString(entity.getDob());
		PatientSearch result = mapper.mapToPatientSerach(entity);
		result.setDob(dob);
		
		List<PatientAddressEntity> addresses = entity.getPatientAddressList();
		for(PatientAddressEntity address : addresses){
			if(AddressType.HOME == address.getAddressType()){
				String currentAddress = address.getAddressLineOne()+", "+address.getCity()
				+" "+address.getState()+", "+address.getZipCode();
				result.setCurrentAddress(currentAddress);
			}
		}
		return result;
	}

	public List<PatientSearch> searchByQuery() {
		List<PatientInfoEntity> entities = piRepo.searchPatientByQuery();
		if(entities.isEmpty()){
			throw new PatientNotFoundException("Patient not found.id");
		}
		List<PatientSearch> resultSet = new ArrayList<PatientSearch>();
		for(PatientInfoEntity entity:entities){
			String dob = validate.dateToString(entity.getDob());
			PatientSearch result = mapper.mapToPatientSerach(entity);
			result.setDob(dob);
			
			List<PatientAddressEntity> addresses = entity.getPatientAddressList();
			for(PatientAddressEntity address : addresses){
				if(AddressType.HOME == address.getAddressType()){
					String currentAddress = address.getAddressLineOne()+", "+address.getCity()
					+" "+address.getState()+", "+address.getZipCode();
					result.setCurrentAddress(currentAddress);
				}
			}
		resultSet.add(result);	
		}
		return resultSet;
	}

}
