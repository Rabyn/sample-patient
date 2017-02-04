package com.cubic.patient.services.impl;

import org.springframework.stereotype.Component;

import com.cubic.patient.entity.PatientAllergyEntity;
import com.cubic.patient.vo.Allergy;

@Component
public class MapperAllergy {

	public PatientAllergyEntity mapToAllergyEntity(final PatientAllergyEntity entity, final Allergy allergy) {
		entity.setAlgName(allergy.getAlgName());
		entity.setAlgCode(allergy.getAlgCode());
		entity.setAlgType(allergy.getAlgType());
		entity.setAlgStatus(allergy.getAlgStatus());
		return entity;
	}
	
	public Allergy mapToPatientAllergy(final PatientAllergyEntity allergyEntity){
		Allergy allergy = new Allergy();
		allergy.setAlgName(allergyEntity.getAlgName());
		allergy.setAlgCode(allergyEntity.getAlgCode());
		allergy.setAlgType(allergyEntity.getAlgType());
		allergy.setAlgStatus(allergyEntity.getAlgStatus());
		return allergy;
	}
}
