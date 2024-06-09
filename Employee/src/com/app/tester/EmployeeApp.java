package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.EmpType;
import com.app.core.Employee;
import com.app.validation.Utils;
public class EmployeeApp {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			List<Employee> empList=new ArrayList<>();
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter Choice: 1.Add full time & part time employee  2.Delete an employee by Emp Id  "
						+ "3.Search employee details by Aadhaar number  4.Display all employee details\r\n"
						+ "5.Display all employee details sorted by date of joining" +"6.Display all employee details sorted by date of joining in descending order" 
						+"7.Update Employee Details "
						);
			System.out.println("choose");
			try {
				switch(sc.nextInt()) {
case 1:					
System.out.println("Enter details: name, dateOfJoining,  phoneNumber,  aadhaarNumber, empType, salary");
Employee employee= Utils.addFullTimeEmployee(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
empList.add(employee);
System.out.println(employee);
System.out.println("Employee added successfully!!");
break;
	
case 2:
	System.out.println("Enter Employee id: ");
	Utils.deleteEmployeeDetails(sc.nextInt(), empList);
	break;

case 3:
	System.out.println("Enter Aadhar Number :");
	Utils.searchEmpDetails(sc.next(), empList);
	break;
	
case 4:
	for(Employee e:empList) {
		System.out.println(e);
	}
	
case 5:
	Collections.sort(empList,new Comparator<Employee>()
			{
            public int compare(Employee e1, Employee e2) {
            	System.out.println("in comparator");
            	return e1.getDateOfJoining().compareTo(e2.getDateOfJoining());
            }
			});
	for (Employee emp : empList) {
        System.out.println(emp);
    }
	break;	
	
case 6:
	Collections.sort(empList,new Comparator<Employee>()
	{
    public int compare(Employee e1, Employee e2) {
    	System.out.println("in comparator");
    	return e2.getDateOfJoining().compareTo(e1.getDateOfJoining());
    }
	});
for (Employee emp : empList) {
System.out.println(emp);
}

case 7:
	System.out.println("Enter Emp ID : ");
	Utils.updateEmpDetails(sc.nextInt(),EmpType.valueOf(sc.next().toUpperCase()), empList);
	break;
}
			}catch(Exception e) {
				e.printStackTrace();
			}
			}		
		}
	}

}
