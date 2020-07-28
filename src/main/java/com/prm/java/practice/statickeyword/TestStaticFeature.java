package com.prm.java.practice.statickeyword;

import com.prm.java.practice.statickeyword.StaticMember.StaticInner;

public class TestStaticFeature {

	public static void main(String[] args) {
		
		StaticMember obj = new StaticMember(101,"Abhi");
		
		System.out.println("Object Values: ");
		
		System.out.println(obj.empId);
		System.out.println(obj.name);
		System.out.println(obj.company + ": comes from Static Variable");
		
		System.out.println("\n"+"Non Static Method: display");
		
		obj.display();
		
		System.out.println("\n"+"Static Method: show");
		
		StaticMember.show(); //  can directly call the static method without using object
		
		obj.show(); // Alllowed 
		
		System.out.println("\n"+"Static Inner Class Static Method: testStatic");
		
		StaticMember.StaticInner.testStatic();
		
		System.out.println("\n"+"Static Inner Class Static Method: testNonStatic");
		
		StaticInner inn = new StaticInner(20000);
		inn.testNonStatic();
		System.out.println(StaticMember.StaticInner.branch);
		
		// we cant acccess salary field directly in this as this is private and can be only accessed using innner class methods
		
		
	}
	
}
