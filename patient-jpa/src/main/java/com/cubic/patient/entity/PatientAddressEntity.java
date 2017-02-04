package com.cubic.patient.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cubic.patient.vo.AddressType;


@Entity
@Table(name = "ADDRESS")
public class PatientAddressEntity {

	@Id
	@Column(name = "ADDRESS_ID")
	@SequenceGenerator(name = "addressSeq", sequenceName = "ADD_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "addressSeq")
	private Long addressPk;
	@Column(name="ADDRESS_LINE_ONE")
	private String addressLineOne;
	@Column(name="ADDRESS_LINE_TWO")
	private String addressLineTwo;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "ZIPCODE")
	private String ZipCode;
	@Enumerated(EnumType.STRING)
	@Column(name="ADDRESS_TYPE")
	private AddressType addressType;
	@Column(name="ACTIVATED_DATE")
	private Date activatedDate;
	@Column(name="DEACTIVATED_DATE")
	private Date deactivatedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PATIENT_ADD_FK")
	private PatientInfoEntity patientAddressFk;
	
	public PatientInfoEntity getPatientAddressFk() {
		return patientAddressFk;
	}

	public void setPatientAddressFk(PatientInfoEntity patientAddressFk) {
		this.patientAddressFk = patientAddressFk;
	}

	public Long getAddressPk() {
		return addressPk;
	}

	public void setAddressPk(Long addressPk) {
		this.addressPk = addressPk;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
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
		return "PatientAddressEntity [addressPk=" + addressPk + ", addressLineOne=" + addressLineOne
				+ ", addressLineTwo=" + addressLineTwo + ", city=" + city + ", state=" + state + ", ZipCode=" + ZipCode
				+ ", addressType=" + addressType + ", activatedDate=" + activatedDate + ", deactivatedDate="
				+ deactivatedDate + ", patientAddressFk=" + patientAddressFk + "]";
	}
}
