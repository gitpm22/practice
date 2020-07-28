package com.prm.java.practice.other;

public class Quesion27 {
	
	public static void parse(String str) {
		
		try {
			
			float f = Float.parseFloat(str);
		}
		catch(NumberFormatException nfe) {
			float f; // this line of code in not there in the question
			f = 0;
		}
		finally {
			float f=0; // this line of code in not there in the question
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		
		parse("invalid");
	}
}
