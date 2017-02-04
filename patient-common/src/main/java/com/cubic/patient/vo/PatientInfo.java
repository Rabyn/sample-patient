package com.cubic.patient.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientInfo {
	
	private String pk;
	private String patientId;
	private String firstname;
	private String lastname;
	private String dob;
	private String gender;
	private String ssn;
	private PrefContactType prefConType;
	private String homePhone;
	private String workPhone;
	private String mobile;
	private String email;
	private String emgName;
	private String emgPhone;
	private String emgRelation;
	private String createdDate;
	private String modifiedDate;
	private String activatedDate;
	private String deactivatedDate;
	
	public String getPk() {
		return pk;
	}
	
	public void setPk(String pk) {
		this.pk = pk;
	}
	
	public String getPatientId() {
		return patientId;
	}
	
	public void setPatientId(String patientId) {
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
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public PrefContactType getPrefConType() {
		return prefConType;
	}

	public void setPrefConType(PrefContactType prefConType) {
		this.prefConType = prefConType;
	}

	public String getHomePhone() {
		return homePhone;
	}
	
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	
	public String getWorkPhone() {
		return workPhone;
	}
	
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmgName() {
		return emgName;
	}
	
	public void setEmgName(String emgName) {
		this.emgName = emgName;
	}
	
	public String getEmgPhone() {
		return emgPhone;
	}
	
	public void setEmgPhone(String emgPhone) {
		this.emgPhone = emgPhone;
	}
	
	public String getEmgRelation() {
		return emgRelation;
	}
	
	public void setEmgRelation(String emgRelation) {
		this.emgRelation = emgRelation;
	}
	
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getActivatedDate() {
		return activatedDate;
	}
	public void setActivatedDate(String activatedDate) {
		this.activatedDate = activatedDate;
	}
	public String getDeactivatedDate() {
		return deactivatedDate;
	}
	public void setDeactivatedDate(String deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}

	@Override
	public String toString() {
		return "PatientInfo [pk=" + pk + ", patientId=" + patientId + ", firstname=" + firstname + ", lastname="
				+ lastname + ", dob=" + dob + ", gender=" + gender + ", ssn=" + ssn + ", prefConType=" + prefConType
				+ ", homePhone=" + homePhone + ", workPhone=" + workPhone + ", mobile=" + mobile + ", email=" + email
				+ ", emgName=" + emgName + ", emgPhone=" + emgPhone + ", emgRelation=" + emgRelation + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + ", activatedDate=" + activatedDate
				+ ", deactivatedDate=" + deactivatedDate + "]";
	}
}
