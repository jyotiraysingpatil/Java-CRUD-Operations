package com.app.core;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Hospital {
private static int idCounter = 1;
private int id;
private String email;
private String name;
private LocalDate appodate;
private String dName;
private Specialization specialization;


public boolean equals(Object o) {
	if(o instanceof Hospital) {
		return this.id==((Hospital)o).id;
	}
	return false;
}



@Override
public String toString() {
	return "Hospital [id=" + id + ", email=" + email + ", name=" + name + ", appodate=" + appodate + ", dName=" + dName
			+ ", specialization=" + specialization + "]";
}





public Hospital(int id) {
	super();
	this.id = id;
}

public Hospital(String email, String name, LocalDate appodate, String dName,
		Specialization specialization) {
	super();
	this.id=idCounter++;
	this.email = email;
	this.name = name;
	this.appodate = appodate;

	this.dName = dName;
	this.specialization = specialization;
}
public static int getIdCounter() {
	return idCounter;
}
public static void setIdCounter(int idCounter) {
	Hospital.idCounter = idCounter;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getAppodate() {
	return appodate;
}
public void setAppodate(LocalDate appodate) {
	this.appodate = appodate;
}

public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public Specialization getSpecialization() {
	return specialization;
}
public void setSpecialization(Specialization specialization) {
	this.specialization = specialization;
}



}
