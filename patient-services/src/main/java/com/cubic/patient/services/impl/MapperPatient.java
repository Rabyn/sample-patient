package com.cubic.patient.services.impl;

import org.springframework.stereotype.Component;

import com.cubic.patient.entity.PatientInfoEntity;
import com.cubic.patient.vo.PatientInfo;

@Component
public class MapperPatient {

	public PatientInfoEntity mapToPatientEntity(final PatientInfoEntity entity, final PatientInfo patientinfo) {
		entity.setFirstname(patientinfo.getFirstname());
		entity.setLastname(patientinfo.getLastname());
		entity.setGender(patientinfo.getGender());
		entity.setSsn(patientinfo.getSsn());
		entity.setPrefConType(patientinfo.getPrefConType());
		entity.setHomePhone(patientinfo.getHomePhone());
		entity.setWorkPhone(patientinfo.getWorkPhone());
		entity.setMobile(patientinfo.getMobile());
		entity.setEmail(patientinfo.getEmail());
		entity.setEmgName(patientinfo.getEmgName());
		entity.setEmgPhone(patientinfo.getEmgPhone());
		entity.setEmgRelation(patientinfo.getEmgRelation());
		
		return entity;
	}
	
	public PatientInfo mapToPatientInfo(final PatientInfoEntity infoEntity){
		PatientInfo info = new PatientInfo();
		info.setFirstname(infoEntity.getFirstname());
		info.setLastname(infoEntity.getLastname());
		info.setGender(infoEntity.getGender());
		info.setSsn(infoEntity.getSsn());
		info.setPrefConType(infoEntity.getPrefConType());
		info.setHomePhone(infoEntity.getHomePhone());
		info.setWorkPhone(infoEntity.getWorkPhone());
		info.setMobile(infoEntity.getMobile());
		info.setEmail(infoEntity.getEmail());
		info.setEmgName(infoEntity.getEmgName());
		info.setEmgPhone(infoEntity.getEmgPhone());
		info.setEmgRelation(infoEntity.getEmgRelation());
		
		return info;
	}
}
