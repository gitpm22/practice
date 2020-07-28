package com.prm.java.practice.interfacepack;

/*########## Rules for Classes ##########*/

/* 
 * 1. One class can extends only one class 
 	e.g. public class PermanentEmployee extends ParentEmployee, DummyClass not allowed
 * 2. One class can implement multiple interfaces and all should be separated by comma.
 	public class PermanentEmployee implements EmployeeRole, EmployeeLeave, ... .
*/


/*########## Rules for Interfaces ##########*/

/* 
 * 1. One interface can extends multiple interface 
 	Example - public interface EmployeeRole extends SuperInterface, EmployeeLeave
 * 2. 
*/




public class PermanentEmployee extends ParentEmployee implements EmployeeRole, EmployeeLeave{

	public void employeeDesignation(int id){		
		if(id == 10){			
			System.out.println("Designation is Developer");			
		}
		else{			
			System.out.println(" Designation is Tester");
		}
	}
	
	public void employeeSalary(int salary){		
		if (salary >= 10000){			
			System.out.println("Salary is enough");				
		}
		else{
			System.out.println(" employee is eligible for hike");
		}		
	}

	public void employeeDesignation() {
		System.out.println("I am implemented method in EmployeeRole");		
	}

	public void employeeSalary() {
		System.out.println("I am implemented method in EmployeeRole");
	}

	public void takeLeave() {
		System.out.println("I am implemented method in EmployeeLeave and Only Permanent Employee taking leave!!");		
	}

	public void employeeID() {
		System.out.println("I am implemented method in Superinterface");		
	}

	
	public static void main(String[] args) {
				
		PermanentEmployee associate = new PermanentEmployee();
		
		/*public class PermanentEmployee extends ParentEmployee implements EmployeeRole, EmployeeLeave{*/
		
		associate.employeeID(); // SuperInterface interface which is implemented
		associate.employeeDesignation(); //EmployeeRole interface which is implemented
		associate.employeeSalary(); //EmployeeRole interface which is implemented
		associate.takeLeave(); //EmployeeLeave interface which is implemented
		associate.work(); // ParentEmployee class which is extended
		
		associate.employeeDesignation(10); // this class PermanentEmployee parameterized methods
		associate.employeeDesignation(11); // this class PermanentEmployee parameterized methods
		
		associate.employeeSalary(10001); // this class PermanentEmployee parameterized methods
		associate.employeeSalary(9000); // this class PermanentEmployee parameterized methods
		
	}
}
