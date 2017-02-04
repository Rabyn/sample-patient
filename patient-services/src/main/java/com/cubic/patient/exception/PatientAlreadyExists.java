package com.cubic.patient.exception;

public class PatientAlreadyExists extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6532165765953896359L;

	public PatientAlreadyExists() {
		// TODO Auto-generated constructor stub
	}

	public PatientAlreadyExists(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PatientAlreadyExists(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PatientAlreadyExists(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PatientAlreadyExists(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
