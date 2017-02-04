package com.cubic.patient.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
	
	private String addressPk;
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String state;
	private String zipCode;
	private AddressType addressType;
	private String activatedDate;
	private String deactivatedDate;
	
	public String getAddressPk() {
		return addressPk;
	}
	
	public void setAddressPk(String addressPk) {
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
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
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
		return "Address [addressPk=" + addressPk + ", addressLineOne=" + addressLineOne + ", addressLineTwo="
				+ addressLineTwo + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", addressType="
				+ addressType + ", activatedDate=" + activatedDate + ", deactivatedDate=" + deactivatedDate + "]";
	}


}
