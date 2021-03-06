package com.cubic.patient.providers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.cubic.patient.exception.InvalidDOBException;
import com.cubic.patient.rest.vo.ErrorType;

@Provider
@Component
public class InvalidDOBExceptionProvider extends AbstractExceptionProvider 
implements ExceptionMapper<InvalidDOBException>{

	public Response toResponse(InvalidDOBException exception) {
		return this.createResponse(ErrorType.INVALID_DOB, exception);
	}

}
