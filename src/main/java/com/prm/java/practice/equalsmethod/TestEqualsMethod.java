package com.prm.java.practice.equalsmethod;

public class TestEqualsMethod {

	public static void main(String[] args) {

		Student std1 = new Student("Preeti");
		Student std2 = new Student("Preeti");
		//Student std2=std1;
		
		System.out.println(""+2*3);
		
		
	if(std1 == std2)
		
		System.out.println("Two objects have same name");
	else if(std1.equals(std2))
		
		System.out.println("Two objects have same name using EQUALS");
	else
		System.out.println("Two objects have different name");


}
}
