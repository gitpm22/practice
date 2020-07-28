package com.prm.java.practice.interfacepack;

public class ContractEmployee extends ParentEmployee implements EmployeeRole {

	public void employeeDesignation() {
		System.out.println("I am implemented method in EmployeeRole");
	}

	public void employeeSalary() {
		System.out.println("I am implemented method in EmployeeRole");

	}

	public void employeeID() {
		System.out.println("I am implemented method in Superinterface");		
	}
	
	public static void main(String[] args) {
		
		ContractEmployee contractor =  new ContractEmployee();
		
		/*public class ContractEmployee extends ParentEmployee implements EmployeeRole {*/
		
		contractor.employeeID(); // SuperInterface interface which is implemented
		contractor.employeeDesignation(); // EmployeeRole interface which is implemented
		contractor.employeeSalary(); // EmployeeRole interface which is implemented
		contractor.work(); // ParentEmployee class which is extended
	}
}
