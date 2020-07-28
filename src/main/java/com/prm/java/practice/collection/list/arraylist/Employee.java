package com.prm.java.practice.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

	public String name;
	private int empId ;

	public Employee() {

		super();
	}


	public Employee(int empId, String name) {
		super();
		this.name = name;
		this.empId = empId;
	}

	public int getNoOfEmployees() {
		int totalCount = 0;

		try {
			System.out.println("How many employees do you wish to add?");

			Scanner scan = new Scanner(System.in);

			totalCount = scan.nextInt();

			System.out.println("Thanks! " + totalCount + " employees will be added to the system");

			scan.close();

		}
		catch(Exception e) {

			System.out.println("exception in getNoOfEmployee");

		}

		return totalCount;

	}
	public ArrayList<Employee> getEmployeeName(int count) {
		
		ArrayList<Employee> empDetails = new ArrayList<Employee>();
		
		String[] empNames = new String[count];
		
		Scanner sc = new Scanner(System.in);
		int id = 100;
		
		try {
			for (int i = 0; i<empNames.length; i++) {

				System.out.println("Please enter employee at index " + i);
								
				String enteredName = sc.next();
				
				empNames[i] = enteredName;
				empDetails.add(new Employee(++id,empNames[i]));
				
				System.out.println(empDetails);
				
			}

				
			}
	
			catch(Exception e) {
				
				System.out.println("exception in getEmployeeName");
			}

		sc.close();

		return empDetails;
	}


	public void printEmployeeRecords(ArrayList<Employee> empData) {


		ArrayList<Employee> empRecords = new ArrayList<Employee>();

		//ArrayList<Employee> empValues = inputStrings;
		//empRecords.forEach(number->System.out.println(number)); 

				for(Employee e: empRecords) {
				System.out.println (e);
				}
	}

	public static void main(String[] args) {
		
		
		try {
			
			Employee employee = new Employee();
			int employeeCount = employee.getNoOfEmployees();

			ArrayList<Employee> empRecord = employee.getEmployeeName(employeeCount);

			//employee.printEmployeeRecords(empdetails);	
			
		}
		catch(Exception e) {
			
			System.out.println("error occured in main");
			
		}


	}

}
