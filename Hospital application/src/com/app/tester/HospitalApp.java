package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Hospital;
import com.app.utils.Validation;

public class HospitalApp {

	public static void main(String[] args) {
		List<Hospital> hospitalList=new ArrayList<>();
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			int counter=0;
			while(!exit) {
				System.out.println("Choose options:  1.add Appointment  2.UpdateDetails  3.display all appointments "
						+ "4.Search details   5.Delete details   6.sORT Appointment date  "
						+ "7.sort the Appointment date in descending order");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter Details : email, name,  appodate,   dName,  specialization");
				    Hospital hospital=Validation.addNewAppointment(sc.next(), sc.next(),sc.next(), sc.next(), sc.next());
				 hospitalList.add(hospital);
				 System.out.println(hospital);
			System.out.println("Apponitment Successfully added");
				break;
				
				case 2:
				 System.out.println("Enter id: ");
				 Validation.updateDetails(sc.nextInt(), hospitalList);
				break;
					
				case 3:
					for(Hospital h: hospitalList) {
						System.out.println(h);
					}
				break;
				
				case 4:
					System.out.println("Enter id");
					Validation.searchDetails(sc.nextInt(), hospitalList);
				break;
				
				case 5:
					System.out.println("Enter id");
					Validation.deleteDetails(sc.nextInt(), hospitalList);
					break;
					
				case 6:
					Collections.sort(hospitalList,new Comparator<Hospital>() {
					public int compare(Hospital h1,Hospital h2) {
						return h1.getAppodate().compareTo(h2.getAppodate());
					}
					});
					for(Hospital h:hospitalList) {
						System.out.println(h);
					}
				break;
				
				case 7:
					Collections.sort(hospitalList, new Comparator<Hospital>() {
					public int compare(Hospital h1,Hospital h2) {
						return h2.getAppodate().compareTo(h1.getAppodate());
					}
					});
					for(Hospital h1:hospitalList) {
						System.out.println(h1);
					}
					break;
			}
			}
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();

	
		}
		}
		}


