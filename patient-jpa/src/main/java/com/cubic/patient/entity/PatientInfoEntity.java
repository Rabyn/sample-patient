package com.cubic.patient.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cubic.patient.vo.PrefContactType;


@Entity
@Table(name = "PATIENT")
public class PatientInfoEntity {
	@Id
	@Column(name = "ID")
	private String patientPk;
	@Column(name = "PATIENT_ID")
	private Long patientId;
	@Column(name = "FIRSTNAME")
	private String firstname;
	@Column(name = "LASTNAME")
	private String lastname;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "SSN")
	private String ssn;
	@Enumerated(EnumType.STRING)
	@Column(name = "PREF_CON_TYPE")
	private PrefContactType prefConType;
	@Column(name = "HOME_PHONE")
	private String homePhone;
	@Column(name = "WORK_PHONE")
	private String workPhone;
	@Column(name = "MOBILE")
	private String mobile;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "EMG_NAME")
	private String emgName;
	@Column(name = "EMG_PHONE")
	private String emgPhone;
	@Column(name = "EMG_RELATION")
	private String emgRelation;
	@Column(name="CREATED_DATE")
	private Date createdDate;
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;
	@Column(name="ACTIVE_DATE")
	private Date activatedDate;
	@Column(name="DEACTIVE_DATE")
	private Date deactivatedDate;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "patientAddressFk")
	private List<PatientAddressEntity> patientAddressList = null;
	
	public List<PatientAddressEntity> getPatientAddressList() {	
		if (patientAddressList == null) {
			patientAddressList = new ArrayList<PatientAddressEntity>();
		}
		return patientAddressList;
	}

	public void setPatientAddressList(List<PatientAddressEntity> patientAddressList) {
		this.patientAddressList = patientAddressList;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "patientAllergyFk")
	private List<PatientAllergyEntity> patientAllergyList = null;
	
	public List<PatientAllergyEntity> getPatientAllergyList() {
		if (patientAllergyList == null) {
			patientAllergyList = new ArrayList<PatientAllergyEntity>();
		}
		return patientAllergyList;
	}

	public void setPatientAllergyList(List<PatientAllergyEntity> patientAllergyList) {
		this.patientAllergyList = patientAllergyList;
	}

	public String getPatientPk() {
		return patientPk;
	}

	public void setPatientPk(String patientPk) {
		this.patientPk = patientPk;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Date getActivatedDate() {
		return activatedDate;
	}

	public void setActivatedDate(Date activatedDate) {
		this.activatedDate = activatedDate;
	}

	public Date getDeactivatedDate() {
		return deactivatedDate;
	}

	public void setDeactivatedDate(Date deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}

	@Override
	public String toString() {
		return "PatientInfoEntity [patientPk=" + patientPk + ", patientId=" + patientId + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", dob=" + dob + ", gender=" + gender + ", ssn=" + ssn + ", prefConType="
				+ prefConType + ", homePhone=" + homePhone + ", workPhone=" + workPhone + ", mobile=" + mobile
				+ ", email=" + email + ", emgName=" + emgName + ", emgPhone=" + emgPhone + ", emgRelation="
				+ emgRelation + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", activatedDate="
				+ activatedDate + ", deactivatedDate=" + deactivatedDate + ", patientAddressList=" + patientAddressList
				+ ", patientAllergyList=" + patientAllergyList + "]";
	}
}
