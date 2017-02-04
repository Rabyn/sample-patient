package com.cubic.patient.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cubic.patient.entity.PatientAddressEntity;

@Repository
public interface PatientAddressRepo extends CrudRepository<PatientAddressEntity, String>{
	
}
