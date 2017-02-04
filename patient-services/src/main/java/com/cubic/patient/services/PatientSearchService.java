package com.cubic.patient.services;

import java.util.List;

import com.cubic.patient.vo.PatientSearch;

public interface PatientSearchService {

	PatientSearch searchById(final Long id);
	
	List<PatientSearch> searchByQuery();
}
