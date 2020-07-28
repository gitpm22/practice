package com.prm.java.practice.overloading;

import com.prm.java.practice.assignments.Employee;

public class TestOverloading1 {
	
	public static void main(String[] args) {
		
		Mangala m = new Mangala("Mangal");
		
		Preeti p = new Preeti("Preet");
		
		Kuhu k = new Kuhu("Aadya");
		
		m.displayName();
		p.displayName();
		k.displayName();
		p.displayName("PreetiMandavgade");
		
		k.displayName("Aadya Chauhan");
		
		//
		
//		Mangala m1 = new Preeti ("Preeti2");
//		Preeti p2 = new Kuhu ("Kuhu2");
//		Mangala m3 = new Kuhu ("kuhu3");
//		
//		m1.displayName();
//		p2.displayName();
//		m3.displayName();
//		
//		//Kuhu k3 = new Preeti("Preeti3");
//		
//		Mangala m4 = new Mangala ("M"); // left side id reference and right
//		Object o = new Mangala ("Mangala"); // Object Class
//		
//		
//		m = p;
//		
//		m.displayName();
//		
//	
//		System.out.println(p.getName());
		
	}
	
	

}
