package com.app.core;

import java.time.LocalDate;

public class Employee {
private static int idCounter=1;
private int empId;
private String name;
private LocalDate dateOfJoining;
private String phoneNumber;
private String aadhaarNumber;
private EmpType empType;
private double salary;

public Employee(int empId) {
	super();
	this.empId = empId;
}

public Employee(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
		EmpType empType, double salary) {
	super();
	this.empId = idCounter++;
	this.name = name;
	this.dateOfJoining = dateOfJoining;
	this.phoneNumber = phoneNumber;
	this.aadhaarNumber = aadhaarNumber;
	this.empType = empType;
	this.salary = salary;
}

public boolean equals(Object o) {
	if(o instanceof Employee) {
		return this.empId==((Employee)o).empId;
	}return false;
}

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public static int getIdCounter() {
	return idCounter;
}



@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", dateOfJoining=" + dateOfJoining + ", phoneNumber="
			+ phoneNumber + ", aadhaarNumber=" + aadhaarNumber + ", empType=" + empType + ", salary=" + salary + "]";
}
public static void setIdCounter(int idCounter) {
	Employee.idCounter = idCounter;
}



public int getEmpId() {
	return empId;
}



public void setEmpId(int empId) {
	this.empId = empId;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public LocalDate getDateOfJoining() {
	return dateOfJoining;
}



public void setDateOfJoining(LocalDate dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}



public String getPhoneNumber() {
	return phoneNumber;
}



public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}



public String getAadhaarNumber() {
	return aadhaarNumber;
}



public void setAadhaarNumber(String aadhaarNumber) {
	this.aadhaarNumber = aadhaarNumber;
}



public EmpType getEmpType() {
	return empType;
}



public void setEmpType(EmpType empType) {
	this.empType = empType;
}


}
