package com.cubic.patient.services;

import com.cubic.patient.vo.Patient;
import com.cubic.patient.vo.PatientInfo;

public interface PatientInfoService {

	String createPatientInfo(final Patient patient);
	
	void modifyPatientInfo(final PatientInfo patientinfo);
	
	Patient findPatientInfo(final String id);

}
