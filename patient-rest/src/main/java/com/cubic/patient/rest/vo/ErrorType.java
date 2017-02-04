package com.cubic.patient.rest.vo;

public enum ErrorType {
	
	GENERIC_ERROR(550), INVALID_DATA_ERROR(520), PATIENT_ALREADY_EXISTS(521), INVALID_DOB(522), PATIENT_NOT_FOUND(523);

	private int code;

	private ErrorType(final int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
