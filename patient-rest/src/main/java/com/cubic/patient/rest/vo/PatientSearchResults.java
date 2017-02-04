package com.cubic.patient.rest.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.cubic.patient.vo.PatientSearch;

@XmlRootElement
public class PatientSearchResults {

	private List<PatientSearch> patients = null;
	
	public PatientSearchResults(){
		
	}
	
	public PatientSearchResults(final List<PatientSearch> patients){
		this.patients = patients;
	}

	public List<PatientSearch> getPatients() {
		return patients;
	}

	public void setPatients(List<PatientSearch> patients) {
		this.patients = patients;
	}
	
	
}
