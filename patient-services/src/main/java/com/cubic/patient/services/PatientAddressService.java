package com.cubic.patient.services;

import java.util.List;

import com.cubic.patient.entity.PatientAddressEntity;
import com.cubic.patient.vo.Address;

public interface PatientAddressService {
	
	List<PatientAddressEntity> createPatientAddress(final List<Address> addressList);
	
	void modifyPatientAddress(final Address address);
	
	List<Address> findPatientAddress(final List<PatientAddressEntity> addressList);

}
