package com.cubic.patient.providers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.cubic.patient.rest.vo.ErrorInfo;
import com.cubic.patient.rest.vo.ErrorType;

@Provider
@Component
public abstract class AbstractExceptionProvider {
	
	protected Response createResponse(final ErrorType errortype, final Exception exception) {
		ErrorInfo entity = new ErrorInfo();
		entity.setErrorCode(errortype.name());
		entity.setErrorDesc(exception.getMessage());
		return Response.status(errortype.getCode()).entity(entity).build();
	}
}
