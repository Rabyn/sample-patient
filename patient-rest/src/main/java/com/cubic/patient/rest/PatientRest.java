package com.cubic.patient.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.patient.services.PatientInfoService;
import com.cubic.patient.vo.Patient;

import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/patient")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Service
public class PatientRest {
	
	@Autowired
	private PatientInfoService pis;
	
	private static Logger logger = LoggerFactory.getLogger(PatientRest.class);
	
	@GET
	@Path("/test")
	public String hello() {
		return "Welcome form Rest";
	}
	
	@POST
	@Path("/create")
	public Response createPatient(final Patient patient){
		logger.debug("Entering PatientRest.createPatient");
		logger.debug("Showing Patient input ={}", patient);
		String pk = pis.createPatientInfo(patient);
		logger.info("LogID = {}", pk);
		patient.getPatientinfo().setPk(pk);
		ResponseBuilder rb = Response.ok().entity(patient);
		return rb.build();
	}
	
	@GET
	@Path("/{id}")
	public Response findPatientById(@PathParam("id") final String id){
		logger.debug("Entering PatientRest.findPatientById");
		logger.debug("Search id : {}",id);
		Patient info = pis.findPatientInfo(id);
		return Response.ok().entity(info).build();
	}
}
