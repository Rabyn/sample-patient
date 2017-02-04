package com.cubic.patient.services.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cubic.patient.entity.PatientAddressEntity;
import com.cubic.patient.services.PatientAddressService;
import com.cubic.patient.vo.Address;

@Service
@Transactional
public class PatientAddressServiceImpl implements PatientAddressService {

	@Autowired
	private MapperAddress mapper;
	
	public List<PatientAddressEntity> createPatientAddress(List<Address> addressList) {
		List<PatientAddressEntity> address = new ArrayList<PatientAddressEntity>();
		for(Address ad: addressList){
			PatientAddressEntity addressEntity = mapper.mapToAddressEntity(new PatientAddressEntity(), ad);
			address.add(addressEntity);
		}
		return address;
	}

	public void modifyPatientAddress(Address address) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Address> findPatientAddress(List<PatientAddressEntity> addressList) {
		List<Address> address = new ArrayList<Address>();	
		for(PatientAddressEntity ad:addressList){
			address.add(mapper.mapToPatientAddress(ad));
		}
		return address;
	}
}
