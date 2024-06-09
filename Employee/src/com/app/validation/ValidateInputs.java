package com.app.validation;

import java.time.LocalDate;

import com.app.core.EmpType;

import com.app.custome_exception.EmployeeException;

public class ValidateInputs {

	
	//parsing date
	public static LocalDate validateDateOfJoining(String dateOfJoining){
		return LocalDate.parse(dateOfJoining);
	}
	
	//validating enum
	
	    public static  EmpType validateEmpType(String empType, double salary) throws EmployeeException {
	            EmpType Type = EmpType.valueOf(empType.toUpperCase());
	            return Type;
	        } 
	    }
	


