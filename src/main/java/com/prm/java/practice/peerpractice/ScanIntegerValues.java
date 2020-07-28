package com.prm.java.practice.peerpractice;

import java.util.Scanner;

import com.prm.java.practice.peerpractice.AdditionOfNumbers;

//com\prm\java\practice\peerpractice\AdditionOfNumbers.java

public class ScanIntegerValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter total number of numbers you wish to add:");

		Scanner scanString = new Scanner(System.in);

		String inputString = scanString.nextLine();

		try{

			final int isStringHoldsInteger = Integer.parseInt(inputString);
			if(isStringHoldsInteger>0) {

				System.out.println("Given String is positive integer");

				
				  System.out.println("Please enter the numbers:");
				  
				  try{
					  
					  Scanner scanInteger = new Scanner(System.in); 
					 String inputInteger = scanInteger.nextLine();
					 int[] givenArray = new int[isStringHoldsInteger];
				  
					  for(int i=0; i<= givenArray.length ; i++) {
						  
						 final int isGivenStringHoldsInteger = Integer.parseInt(inputInteger); 
						  						
						  if(isGivenStringHoldsInteger>0) {
							  
							  givenArray[i] = scanInteger.nextInt(); 
							  
						  }
						  else {
							  System.out.println("Given number is negative integer.Please enter only positive integer"); 
							  
						  }
					  }
					/*
					 * int sum =0;
					 * 
					 * for (int i=0; i<givenArray.length; i++) {
					 * 
					 * sum = sum+givenArray[i];
					 * 
					 * } System.out.println("Sum is:" + sum);
					 */
	
				  } catch(NumberFormatException e){
				  
				  System.out.println("Kindly enter only positive integers"); }		

			}
			else {System.out.println("Given String is negative integer");
			}

		}
		catch(NumberFormatException e){

			System.out.println("Kindly enter only positive integers");
		}

	}

}
