package com.cubic.patient.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Allergy")
public class PatientAllergyEntity {
	
	@Id
	@Column(name = "Allergy_ID")
	@SequenceGenerator(name = "addressSeq", sequenceName = "ALG_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "addressSeq")
	private Long allergyPk;
	@Column(name="ALG_NAME")
	private String algName;
	@Column(name="ALG_CODE")
	private String algCode;
	@Column(name="ALG_TYPE")
	private String algType;
	@Column(name="STATUS")
	private String algStatus;
	@Column(name="ACTIVATED_DATE")
	private Date activatedDate;
	@Column(name="INACTIVATED_DATE")
	private Date deactivatedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PATIENT_ALG_FK")
	private PatientInfoEntity patientAllergyFk;
	
	public PatientInfoEntity getPatientAllergyFk() {
		return patientAllergyFk;
	}
	public void setPatientAllergyFk(PatientInfoEntity patientAllergyFk) {
		this.patientAllergyFk = patientAllergyFk;
	}
	
	public Long getAllergyPk() {
		return allergyPk;
	}
	public void setAllergyPk(Long allergyPk) {
		this.allergyPk = allergyPk;
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
	public Date getActivatedDate() {
		return activatedDate;
	}
	public void setActivatedDate(Date activatedDate) {
		this.activatedDate = activatedDate;
	}
	public Date getDeactivatedDate() {
		return deactivatedDate;
	}
	public void setDeactivatedDate(Date deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}
	@Override
	public String toString() {
		return "PatientAllergyEntity [allergyPk=" + allergyPk + ", algName=" + algName + ", algCode=" + algCode
				+ ", algType=" + algType + ", algStatus=" + algStatus + ", activatedDate=" + activatedDate
				+ ", deactivatedDate=" + deactivatedDate + ", patientAllergyFk=" + patientAllergyFk + "]";
	}
	
}
