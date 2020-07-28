package com.prm.java.practice.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDatabase {

	private String name;

	private String empId;

	public int getEmployeeCount() {


		System.out.println("how many employees you wish to add to the system?");

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		scan.close();

		return count;
	}
	
	public void getEmployeeNames(int employeeCount){
		
		ArrayList<EmployeeDatabase> empDetails = new ArrayList<EmployeeDatabase>();
		
		String[] empNames = new String [employeeCount];
		
		Scanner scanName = new Scanner(System.in);
		try {
				for(int i=0; i<empNames.length;i++) {
				
				System.out.println("Please enter the name at " + i);
				
				//if(scanName.nextLine()!= null) {
					
					String enteredName = scanName.next();
					System.out.println("Entered name: " + enteredName);
				//}
				//else{
				//	System.out.println("no nextline found");
				//}
								
			}
		}
		catch(Exception e) {
			
			System.out.println("Exception in getEmployee");
		}
		
		//return empDetails;
		
	}

	public static void main(String[] args) {
		
		try {
			EmployeeDatabase emp = new EmployeeDatabase();

			int employeeStrength = 	emp.getEmployeeCount();

			//System.out.println(employeeStrength);
			
			emp.getEmployeeNames(employeeStrength);
		}
		catch(Exception e) {
			
			System.out.println("exception in main");
		}




	}

}
