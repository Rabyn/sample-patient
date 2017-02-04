package com.cubic.patient.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cubic.patient.entity.PatientInfoEntity;

@Repository
public interface PatientInfoRepo extends CrudRepository<PatientInfoEntity, String> {

	@Query(value = "select pat_seq.nextval from dual", nativeQuery = true)
	Long getPatientID();

	@Query("select count(*) from PatientInfoEntity c where UPPER(c.firstname) = UPPER(?1)"
			+ " AND UPPER(c.ssn) like (%?2) AND UPPER(c.gender) = UPPER(?3)")
	Long checkAvailability(final String firstName, final String ssn, final String gender);

	@Query(value = "select count(*) from PATIENT p1 where UPPER(p1.FIRSTNAME) = UPPER(?1)"
			+ " and UPPER(p1.SSN) like (%?2) and UPPER(p1.GENDER) = UPPER(?3)"
			+ " and p1.ID not in(select ID from PATIENT p2 where p2.ID = (?4))", nativeQuery = true)
	Long editCheckAvailability(final String firstName, final String ssn, final String gender, final String pk);

	@Query("select c from PatientInfoEntity c where c.patientId = (?1)")
	PatientInfoEntity searchPatientById(final Long id);
	
	@Query("select c from PatientInfoEntity c")
	List<PatientInfoEntity> searchPatientByQuery();
}