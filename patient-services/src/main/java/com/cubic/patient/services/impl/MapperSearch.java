package com.cubic.patient.services.impl;

import org.springframework.stereotype.Component;

import com.cubic.patient.entity.PatientInfoEntity;
import com.cubic.patient.vo.PatientSearch;

@Component
public class MapperSearch {

	public PatientSearch mapToPatientSerach(final PatientInfoEntity entity){
		PatientSearch result = new PatientSearch();
		result.setPk(entity.getPatientPk());
		result.setPatientId(entity.getPatientId());
		result.setFirstname(entity.getFirstname());
		result.setLastname(entity.getLastname());
		result.setSsn(entity.getSsn());
		result.setGender(entity.getGender());
		result.setMobile(entity.getMobile());
		return result;
	}
}
