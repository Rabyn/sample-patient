package com.cubic.patient.services.impl;

import org.springframework.stereotype.Component;

import com.cubic.patient.entity.PatientAddressEntity;
import com.cubic.patient.vo.Address;

@Component
public class MapperAddress {

	public PatientAddressEntity mapToAddressEntity(final PatientAddressEntity entity, final Address address) {
		entity.setAddressLineOne(address.getAddressLineOne());
		entity.setAddressLineTwo(address.getAddressLineTwo());
		entity.setCity(address.getCity());
		entity.setState(address.getState());
		entity.setZipCode(address.getZipCode());
		entity.setAddressType(address.getAddressType());
		
		return entity;
	}
	
	public Address mapToPatientAddress(final PatientAddressEntity addressEntity){
		Address address = new Address();
		address.setAddressLineOne(addressEntity.getAddressLineOne());
		address.setAddressLineTwo(addressEntity.getAddressLineTwo());
		address.setCity(addressEntity.getCity());
		address.setState(addressEntity.getState());
		address.setZipCode(addressEntity.getZipCode());
		address.setAddressType(addressEntity.getAddressType());
		return address;
	}
}
