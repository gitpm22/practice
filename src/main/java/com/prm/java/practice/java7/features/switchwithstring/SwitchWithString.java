package com.prm.java.practice.java7.features.switchwithstring;

public class SwitchWithString {
	
	public void getDayInfo(String day) {
		
		switch(day) {
		
		case "Monday":
			System.out.println("its Weekday");
			
			break;
			
		case "Tuesday":
			System.out.println("its Weekday");
			break;
			
		case "Wednesday":
			System.out.println("its Weekday");
			break;
			
		case "Thursday":
			System.out.println("its Weekday");
			break;
			
		case "Friday":
			System.out.println("its Weekday"); // no break statement so will be printed definitely
			
			
		case "Saturday":
			System.out.println("its Weekend");
			break;
			
		case "Sunday":
			System.out.println("its Weekend"); // no break statement so will be printed definitely
		
		}
	}

	public static void main(String[] args) {
	
		SwitchWithString refOfObject = new SwitchWithString();
		
		//refOfObject.getDayInfo("Monday");
		
		refOfObject.getDayInfo("Friday"); // as there is no break statement in case "Friday" all of the remaining cases will be printed

	}

}
