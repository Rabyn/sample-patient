package com.cubic.patient.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Allergy {
	
	private String patientId;
	private Long allergyPk;
	private String algName;
	private String algCode;
	private String algType;
	private String algStatus;
	private String activatedDate;
	private String deactivatedDate;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public Long getAllergyPk() {
		return allergyPk;
	}
	public void setAllergyPk(Long allergyPk) {
		this.allergyPk = allergyPk;
	}
	
	public String getAlgName() {
		return algName;
	}
	public void setAlgName(String algName) {
		this.algName = algName;
	}
	public String getAlgCode() {
		return algCode;
	}
	public void setAlgCode(String algCode) {
		this.algCode = algCode;
	}
	public String getAlgType() {
		return algType;
	}
	public void setAlgType(String algType) {
		this.algType = algType;
	}
	public String getAlgStatus() {
		return algStatus;
	}
	public void setAlgStatus(String algStatus) {
		this.algStatus = algStatus;
	}
	public String getActivatedDate() {
		return activatedDate;
	}
	public void setActivatedDate(String activatedDate) {
		this.activatedDate = activatedDate;
	}
	public String getDeactivatedDate() {
		return deactivatedDate;
	}
	public void setDeactivatedDate(String deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}
	@Override
	public String toString() {
		return "Allergy [patientId=" + patientId + ", allergyPk=" + allergyPk + ", algName=" + algName + ", algCode="
				+ algCode + ", algType=" + algType + ", algStatus=" + algStatus + ", activatedDate=" + activatedDate
				+ ", deactivatedDate=" + deactivatedDate + "]";
	}
}
