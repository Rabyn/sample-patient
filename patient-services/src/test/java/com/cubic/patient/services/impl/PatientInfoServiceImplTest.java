/*package com.cubic.patient.services.impl;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.cubic.patient.entity.PatientInfoEntity;
import com.cubic.patient.repo.PatientInfoRepo;
import com.cubic.patient.services.validations.Validations;
import com.cubic.patient.util.PatientInfoData;
import com.cubic.patient.vo.Patient;
import com.cubic.patient.vo.PatientInfo;

@RunWith(MockitoJUnitRunner.class)
public class PatientInfoServiceImplTest {

	@Mock
	private Validations validate;
	
	@Mock
	private PatientInfoRepo piRepo;
	
	@Spy
	PatientInfoServiceImpl impl;
	
	private Patient input;
	private PatientInfoEntity output;
	
	@Before
	public void setup() {
		input = PatientInfoData.createPatient();
		output = PatientInfoData.createPatientEntity();
	}
	
	@Test
	public void testCreatePatient() {
	when(piRepo.save(any(PatientInfoEntity.class))).thenReturn(output);
	PatientInfo patientinfo = input.getPatientinfo();
	validate.validateInfo(patientinfo);
	String result = impl.createPatientInfo(input);
	assertNotNull(result);
	}
}
*/