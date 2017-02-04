package com.cubic.patient.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.patient.rest.vo.PatientSearchResults;
import com.cubic.patient.services.PatientSearchService;
import com.cubic.patient.vo.PatientSearch;

@Path("/search")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Service
public class PatientSearchRest {
	private static Logger logger = LoggerFactory.getLogger(PatientSearchRest.class);

	@Autowired
	private PatientSearchService pss;
	
	@GET
	@Path("/{id}")
	public Response searchPatientById(@PathParam("id") final Long id){
		logger.debug("Entering PatientRest.findPatientById");
		PatientSearch result = pss.searchById(id);
		return Response.ok().entity(result).build();
	}
	
	@GET
	@Path("/search")
	public Response searchPatientByQuery() {
		List<PatientSearch> searchResults = pss.searchByQuery();
		return Response.ok().entity(new PatientSearchResults(searchResults)).build();
	}
}
