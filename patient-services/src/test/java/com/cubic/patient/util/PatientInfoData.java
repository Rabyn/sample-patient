/*package com.cubic.patient.util;

import java.util.ArrayList;
import java.util.List;

import com.cubic.patient.entity.PatientInfoEntity;
import com.cubic.patient.vo.Address;
import com.cubic.patient.vo.AddressType;
import com.cubic.patient.vo.Allergy;
import com.cubic.patient.vo.Patient;
import com.cubic.patient.vo.PatientInfo;

public class PatientInfoData {
	
	public static PatientInfo PatientInfo(){
		PatientInfo pi = new PatientInfo();
		pi.setFirstname("Rabindra");
		pi.setLastname("Shrestha");
		pi.setGender("male");
		pi.setSsn("328-65-4951");
		pi.setDob("10-14-1988");
		pi.setEmail("rabynshrestha@gmail.com");
		return pi;
	}
	
	public static List<Address> address(){
		List<Address> address = new ArrayList<Address>();
		Address addd = new Address();
		addd.setAddressLineOne("13857 High Mesa Rd");
		addd.setCity("Roanoke");
		addd.setState("texas");
		addd.setZipCode("76262");
		addd.setAddressType(AddressType.HOME);
		address.add(addd);
		return address;
	}
	
	public static List<Allergy> allergy(){
		List<Allergy> alergy = new ArrayList<Allergy>();
		Allergy alg = new Allergy();
		alg.setAlgName("abc");
		alg.setAlgCode("123");
		alergy.add(alg);
		return alergy;
	}
	
	public static Patient createPatient() {
		Patient p = new Patient();
		p.setPatientinfo(PatientInfo());
		p.setAddress(address());
		p.setAllergy(allergy());
		return p;
	}

	public static PatientInfoEntity createPatientEntity() {
		PatientInfoEntity pie = new PatientInfoEntity();
		pie.setFirstname("Rabindra");
		pie.setLastname("Shrestha");
		return pie;
	}
}
*/