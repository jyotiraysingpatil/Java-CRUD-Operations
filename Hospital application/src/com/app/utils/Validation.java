package com.app.utils;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.app.core.Hospital;
import com.app.core.Specialization;

import com.app.custome_exception.HospitalException;


public class Validation {
 public static Hospital addNewAppointment( String email, String name, String appodate, String dName,
		 String specialization)throws HospitalException{
	 Specialization type=validateSpecialization(specialization);
	 LocalDate appDate=validateappoDate(appodate);
	
	 return new Hospital(email,name,appDate,dName,type);
 }
	
	public static LocalDate validateappoDate(String appodate) {
		return LocalDate.parse(appodate);
	}
	
	public static Specialization validateSpecialization(String specialization) throws HospitalException{
		Specialization Type=Specialization.valueOf(specialization.toUpperCase());
		return Type;
	}
	
	
	//update timeslot
	public static void updateDetails(int id,List<Hospital> hospitalList) throws HospitalException {
	    Hospital h = new Hospital(id);
	    int index = hospitalList.indexOf(h);
	    if (index == -1) {
	        throw new HospitalException("Details not found!!!");
	    }
	    Hospital hospital=hospitalList.get(index);
	   hospital.setAppodate(LocalDate.now());
	    System.out.println(hospital);
	}

	//search details
	public static void searchDetails(int id,List<Hospital>hospitalList )throws HospitalException {
		Iterator<Hospital> itr =hospitalList.iterator();
		while(itr.hasNext()) {
			Hospital hospital=itr.next();
			if(hospital.getAppodate().equals(hospital)) {
				System.out.println(hospital);
			}
		}
	}
	
	//delete details
	public static void deleteDetails(int id,List<Hospital> hospitList)throws HospitalException {
		Iterator<Hospital> itr=hospitList.iterator();
		while(itr.hasNext()) {
			Hospital h=itr.next();
		if(h.getId()==id) {
			itr.remove();
			System.out.println(h);
		}
			
		}
	}
	
	
}