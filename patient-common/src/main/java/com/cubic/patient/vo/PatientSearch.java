package com.cubic.patient.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientSearch {

	private String pk;
	private Long patientId;
	private String firstname;
	private String lastname;
	private String dob;
	private String gender;
	private String month;
	private String day;
	private String year;
	private String ssn;
	private String mobile;
	private String currentAddress;

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	@Override
	public String toString() {
		return "PatientSearch [pk=" + pk + ", patientId=" + patientId + ", firstname=" + firstname + ", lastname="
				+ lastname + ", dob=" + dob + ", gender=" + gender + ", month=" + month + ", day=" + day + ", year="
				+ year + ", ssn=" + ssn + ", mobile=" + mobile + ", currentAddress=" + currentAddress + "]";
	}

}
