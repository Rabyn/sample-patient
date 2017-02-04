package com.cubic.patient.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.patient.services.PatientAddressService;
import com.cubic.patient.services.PatientAllergyService;
import com.cubic.patient.services.PatientInfoService;
import com.cubic.patient.vo.Address;
import com.cubic.patient.vo.Allergy;
import com.cubic.patient.vo.PatientInfo;

@Path("/modify")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Service
public class PatientModifyRest {
	
	private static Logger logger = LoggerFactory.getLogger(PatientModifyRest.class);
	
	@Autowired
	private PatientInfoService pis;
	
	@Autowired
	private PatientAddressService pads;
	
	@Autowired
	private PatientAllergyService pals;
	
	@PUT
	@Path("/info")
	public Response modifyPatientInfo(final PatientInfo patientinfo){
		logger.debug("Entering PatientModifyRest.ModifyPatientInfo");
		pis.modifyPatientInfo(patientinfo);
		return Response.noContent().build();
	}
	
	@PUT
	@Path("/address")
	public Response modifyPatientAddress(final Address address){
		pads.modifyPatientAddress(address);
		return Response.noContent().build();
	}
	
	@PUT
	@Path("/allergy")
	public Response modifyPatientAllergy(final Allergy allergy){
		pals.modifyPatientAllergy(allergy);
		return Response.noContent().build();
	}
	
}
