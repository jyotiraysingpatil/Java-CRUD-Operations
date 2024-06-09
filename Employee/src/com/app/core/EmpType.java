package com.app.core;

public enum EmpType {
FULLTIME(50000),PARTTIME(30000);
	
	private double salary;

	private EmpType(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
