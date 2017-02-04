package com.cubic.patient.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cubic.patient.entity.PatientAllergyEntity;
import com.cubic.patient.services.PatientAllergyService;
import com.cubic.patient.vo.Allergy;

@Service
@Transactional
public class PatientAllergyServiceImpl implements PatientAllergyService {

	@Autowired
	private MapperAllergy mapper;
	
	public List<PatientAllergyEntity> createPatientAllergy(List<Allergy> allergyList) {
		List<PatientAllergyEntity> allergy = new ArrayList<PatientAllergyEntity>();
		for(Allergy al: allergyList){
			PatientAllergyEntity allergyEntity = mapper.mapToAllergyEntity(new PatientAllergyEntity(), al);
			allergy.add(allergyEntity);
		}
		return allergy;
	}

	public void modifyPatientAllergy(Allergy allergy) {
		// TODO Auto-generated method stub
		
	}

	public List<Allergy> findPatientAllergy(List<PatientAllergyEntity> allergyList) {
		List<Allergy> allergy = new ArrayList<Allergy>();	
		for(PatientAllergyEntity al:allergyList){
			allergy.add(mapper.mapToPatientAllergy(al));
		}
		return allergy;
	}
}
