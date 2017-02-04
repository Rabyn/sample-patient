package com.cubic.patient.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cubic.patient.entity.PatientAllergyEntity;

@Repository
public interface PatientAllergyRepo extends CrudRepository<PatientAllergyEntity, Long> {

}
