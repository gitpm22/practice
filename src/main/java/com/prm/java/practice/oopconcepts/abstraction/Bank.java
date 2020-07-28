package com.prm.java.practice.oopconcepts.abstraction;

abstract class Bank {

	public void login() {
		
		System.out.println("Please enter your credentials");
		
	}
	
	public void logout() {
		
		System.out.println("You successfully logged out");
		
	}
	
	public abstract void calculateInterest();
}
