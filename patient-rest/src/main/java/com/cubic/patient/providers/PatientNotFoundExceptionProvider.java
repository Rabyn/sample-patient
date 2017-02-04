package com.cubic.patient.providers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.cubic.patient.exception.PatientNotFoundException;
import com.cubic.patient.rest.vo.ErrorType;

@Provider
@Component
public class PatientNotFoundExceptionProvider extends AbstractExceptionProvider 
implements ExceptionMapper<PatientNotFoundException> {

	public Response toResponse(PatientNotFoundException exception) {
		return this.createResponse(ErrorType.PATIENT_NOT_FOUND, exception);
	}

}
