package com.prm.java.practice.statickeyword;


public class StaticMember {
	
public int empId; // non static variable
public String name; // non static variable

public static String company = "abc"; // static variable

// Parametrised constructor

public StaticMember(int empId, String name) {
	
	this.empId = empId;
	this.name = name;
}

public void display() {
	
	// Non static method (display) can access non static variables (empId,name) and Static variables (company)
	
	String company = "IBM"; // local variable where company is updated : here only object's company value will be changed not static variable value
	
	//static String Branch = "Pune"; // compilation error : can't create new static variable inside the non static method
	
	System.out.println(empId); // Instance Variable
	System.out.println(name); // Instance Variable
	System.out.println(company + " Updated Value of Company: Accessed via dislay"); // Static Variable
}

public static void show() {
	
	// Static methods can access only static variables
	
	// static String branch = "Pune"; // Compilation error - illegal modifier
	
	// System.out.println(empId); // Compilation Error for Non static fields
	// System.out.println(name);
	System.out.println(company + ": comes from Static Variable");
	
}

public static class StaticInner {
	
	public static String branch = "Pune";
	private int salary;
	
	public StaticInner(int sal) {
		
		this.salary = sal;
	}
	
	public void testNonStatic() {
		
		// static int basic = 1000; // compilation error - not allowed
		
		System.out.println(salary);
		System.out.println(branch);
	}
	public static void testStatic() {
		
		// static int basic = 1000; //compilation error - not allowed
		
		//System.out.println(salary); // non static variable not allowed
		System.out.println(branch);
	}
	
}


}
