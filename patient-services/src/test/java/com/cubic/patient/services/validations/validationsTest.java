/*package com.cubic.patient.services.validations;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.cubic.patient.exception.InvalidDOBException;
import com.cubic.patient.util.PatientInfoData;
import com.cubic.patient.util.Validator;
import com.cubic.patient.vo.Patient;

@RunWith(MockitoJUnitRunner.class)
public class validationsTest{

	@Spy
	private Validations validate;
	
	private Patient input;
	
	@Before
	public void setup() {
		input = PatientInfoData.createPatient();
	}
	
	@Test(expected = InvalidDOBException.class)
	public void test() {
		validate.validateInfo(input.getPatientinfo());
	}

}*/