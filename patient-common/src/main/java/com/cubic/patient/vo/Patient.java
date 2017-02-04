package com.cubic.patient.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Patient {

	private PatientInfo patientinfo;
	
	private List<Address> address;
	
	private List<Allergy> allergy;

	public PatientInfo getPatientinfo() {
		return patientinfo;
	}

	public void setPatientinfo(PatientInfo patientinfo) {
		this.patientinfo = patientinfo;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Allergy> getAllergy() {
		return allergy;
	}

	public void setAllergy(List<Allergy> allergy) {
		this.allergy = allergy;
	}

	@Override
	public String toString() {
		return "Patient [patientinfo=" + patientinfo + ", address=" + address + ", allergy=" + allergy + "]";
	}
}
