package com.cubic.patient.services.validations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.cubic.patient.exception.InvalidDOBException;
import com.cubic.patient.exception.InvalidDataException;
import com.cubic.patient.util.Validator;
import com.cubic.patient.vo.PatientInfo;
import com.cubic.patient.vo.PrefContactType;

@Component
public class Validations extends Validator {
	private static Logger logger = LoggerFactory.getLogger(Validations.class);
	public void validateInfo(final PatientInfo patientInfo) {

		// Check For any Null Fields
		if (patientInfo == null || StringUtils.isEmpty(patientInfo.getFirstname())
				|| StringUtils.isEmpty(patientInfo.getLastname()) || StringUtils.isEmpty(patientInfo.getSsn())) {
			throw new InvalidDataException("Invalid Data to Persist the Record");
		}

		// Check SSN Pattern
		if (!checkSsn(patientInfo.getSsn())) {
			throw new InvalidDataException("Invalid SSN to Persist the Record");
		}
		logger.debug("Checking Email Outside");
		// Check Email Pattern
		if(patientInfo.getPrefConType() == PrefContactType.EMAIL){
			logger.debug("Checking Email Inside");
			if (StringUtils.isEmpty(patientInfo.getEmail()) || !checkEmail(patientInfo.getEmail())) {
				throw new InvalidDataException("Invalid Email to Persist the Record");
			}
		}

		// Check if DOB is Greater That Current Date
		if (stringToDate(patientInfo.getDob()).after(getCurrentDate())) {
			throw new InvalidDOBException("Date of Birth is greater than current Date");
		}

		// Check if DOB is Before 100 Years
		if (stringToDate(patientInfo.getDob()).before(getPastDate())) {
			throw new InvalidDOBException("Date of Birth is 100 years old");
		}
	}
}
