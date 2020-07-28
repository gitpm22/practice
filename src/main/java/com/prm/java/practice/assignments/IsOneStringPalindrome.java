package com.prm.java.practice.assignments;

import java.util.Scanner;

public class IsOneStringPalindrome{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any String:");
		Scanner scannerObject = new Scanner(System.in);
		String inputString = scannerObject.nextLine();
		
		System.out.println("InputString Length:" + inputString.length());
				
		char[] stringToChar = inputString.toCharArray();
		
		System.out.println("stringToChar Array Length:" + stringToChar.length);
		
		if(stringToChar.length%2 == 0){			
			System.out.println("Characters in Array is even in numbers");			
		}else{			
			System.out.println("Characters in Array has odd numbers");						
		}
		
		int dividedString = stringToChar.length/2;
		System.out.println("Half of the string length is: " + dividedString);
				
		Boolean flag = true;			
		
		for(int i=0,j=stringToChar.length; i<dividedString && j>dividedString; i++,j--){
			
		if(stringToChar[i] == stringToChar[j-1]){
			
			flag = true;
			
		}else{
			
			flag = false;
			break;				
			
		}			

		}
		
		if(flag == true){
			
			System.out.println("This is palindrome");
		}else{
			
			System.out.println("This is not palindrome");
		}
	
	}

}
