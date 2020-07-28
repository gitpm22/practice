package com.prm.java.practice.vararg;

import java.util.Scanner;

import com.prm.java.practice.assignments.InvalidInput;

public class NewVarArg {
	
	public NewVarArg() {
		super();
	}



	public int readAndValidateTotalCount() {

		System.out.println("Please enter total count of numbers: ");

		Scanner scanTotalCount = new Scanner(System.in);

		int totalCount = 0;

		try {

			String inputTotalCount = scanTotalCount.nextLine(); 
			int parsedTotalCount = Integer.parseInt(inputTotalCount); 
			if(parsedTotalCount>0)
			{ totalCount = parsedTotalCount;

			} else {

				throw new InvalidInput("Negative Integer. Total Count should be only positive integer."	);

			}

		}catch(InvalidInput e) {

			System.err.println(e.getMessage());

		}

		catch(NumberFormatException e) {

			System.err.println("You have not entered numeric input.");

		}
		return totalCount;

	}


	public int[] readAndValidateInputNumbers(int totalCount) {

		Scanner scanElements = new Scanner(System.in);

		int[] givenArray = new int[totalCount];

		for (int i=0; i<givenArray.length; i++) {

			try {
				System.out.println("Please enter the number at " + i);
				String inputElements = scanElements.nextLine();
				int parsedInputElement = Integer.parseInt(inputElements);
				if(parsedInputElement>0) {

					givenArray[i] = parsedInputElement;

				}

			}
			catch(NumberFormatException e) {

				System.err.println("Please enter correct number");
				i--;
			}	}		

		return givenArray;
	}
	
	public void displayArray(int[] givenArray) {

		System.out.println("You have entered below numbers:");

		for(int i=0; i<givenArray.length;i++) {

			System.out.println(givenArray[i]);

		}
	}
	
	public void show(int ...arr) {
		
		System.out.println("Given Array is :");
		
		try {
			
			for(int i:arr) {
				
				System.out.println(i);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("out of bound");
		}
		
		
	}
}
