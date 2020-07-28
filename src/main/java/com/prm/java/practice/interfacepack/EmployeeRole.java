package com.prm.java.practice.interfacepack;

/*########## Rules for Interfaces ##########*/

/* 
 * 1. One interface can extends multiple interfaces 
 	Example - public interface EmployeeRole extends SuperInterface, EmployeeLeave
 * 2. 
*/

public interface EmployeeRole extends SuperInterface{
	
	public void employeeDesignation();
	
	public void employeeSalary();
}
