package com.cubic.patient.providers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.cubic.patient.rest.vo.ErrorType;

@Provider
@Component
public class GenericExceptionProvider extends AbstractExceptionProvider implements ExceptionMapper<Exception> {

	public Response toResponse(Exception exception) {
		return this.createResponse(ErrorType.GENERIC_ERROR, exception);
	}
}
