package com.cubic.patient.services;

import java.util.List;

import com.cubic.patient.entity.PatientAllergyEntity;
import com.cubic.patient.vo.Allergy;

public interface PatientAllergyService {
	
	List<PatientAllergyEntity> createPatientAllergy(final List<Allergy> allergyList);
	
	void modifyPatientAllergy(final Allergy allergy);
	
	List<Allergy> findPatientAllergy(final List<PatientAllergyEntity> allergyList);
}
