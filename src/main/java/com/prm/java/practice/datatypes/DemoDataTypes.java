package com.prm.java.practice.datatypes;

public class DemoDataTypes {
	
	//Constructor is invoked everytime object is created
	public DemoDataTypes() {
		System.out.println("Default Constructor invoked!!");
		
		intNumber=-1;
		pubIntNumber=-2;
	}
	
	//Parameterized Consructor
	public DemoDataTypes(int intNumber, int pubIntNumber) {
		System.out.println("Parameterized Constructor invoked!!");
		
		this.intNumber=intNumber;
		this.pubIntNumber=pubIntNumber;
	}

	//Non-Static variables are member variables
	//Every object has their own copy
	private int intNumber;
	public int pubIntNumber;
	
	//Static variables are class level variables
	//There is only one copy, they are never part of any object
	public static int staticInt;


	public int getIntNumber() {
		return intNumber;
	}
	public void setIntNumber(int intNumber) {
		if(intNumber>0)
			this.intNumber = intNumber;
	}

	/*private static void main(Integer[] args) {
		//System.out.println(intNumber);
	}*/



}
