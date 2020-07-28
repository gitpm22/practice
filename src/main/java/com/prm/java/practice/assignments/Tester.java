package com.prm.java.practice.assignments;

import com.prm.java.practice.assignments.Employee;

public class Tester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101,"Preeti",1000.0f, "Pune");
		Employee e2 = new Employee(102,"Preeti",2000.0f, "Mumbai");
		Employee e3 = new Employee(101,"Preeti",1000.0f, "Pune");
		System.out.println("e1 = " + e1.getName());
		System.out.println("e2 = " + e2.getName());
		
			System.out.println(e1 == e2);
			System.out.println(e2 == e1);
			
		
			
			System.out.println(e1.equals(e2)); // runtime polymorphism // dynamic overloading
			
			System.out.println(e2.equals(e1));
			
			//e3 = e1;
			
			//System.out.println(e1.equals(e3));
			//e1.setName("2"); 
			


	}
	
}
