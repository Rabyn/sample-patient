package com.cubic.patient.providers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.cubic.patient.exception.InvalidDataException;
import com.cubic.patient.rest.vo.ErrorType;

@Provider
@Component
public class InvalidDataExceptionProvider extends AbstractExceptionProvider 
	implements ExceptionMapper<InvalidDataException>{

	public Response toResponse(InvalidDataException exception) {
		return this.createResponse(ErrorType.INVALID_DATA_ERROR, exception);
	}
}
