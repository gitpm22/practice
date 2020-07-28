package com.prm.java.practice.overloading.dynamic;

/*Parent Class - Any parent class can have multiple child classes however reverse is not possible

Child Class - Any child class can have only one parent*/


public class TestDynamicOverloading {

	public static void main(String[] args) {
	
		Abhishek a1 = new Abhishek();
		Preeti p1 = new Preeti();
		Aadya ac1= new Aadya();
		
		a1.eyeColor();
		a1.hairTexture();
		a1.msDegree();
		
		p1.eyeColor();
		p1.hairTexture();
		p1.mBADegree();
		
		
		ac1.eyeColor();
		ac1.hairTexture();
		ac1.education();
		
		
		System.out.println("---------------------------------");
		
		a1 = p1;
		
		a1.eyeColor();
		a1.hairTexture();
		a1.msDegree();
		// a1.mBADegree(); this is not allowed
		
		

	}

}
