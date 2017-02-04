package com.cubic.patient.providers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.cubic.patient.exception.PatientAlreadyExists;
import com.cubic.patient.rest.vo.ErrorType;

@Provider
@Component
public class PatientAlreadyExistsProvider extends AbstractExceptionProvider 
	implements ExceptionMapper<PatientAlreadyExists>{

	public Response toResponse(PatientAlreadyExists exception) {
		return this.createResponse(ErrorType.PATIENT_ALREADY_EXISTS, exception);
	}

}
