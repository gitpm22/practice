package com.prm.java.practice.peerpractice;

import java.util.Scanner;

/*
 * ##### Java Program to Add two Numbers / Numbers #####
 * */



public class AdditionOfNumbers {

	// Method to read and validate user inpit for total number of elements to add

	public int readAndValidateTotalCount() {

		System.out.println("Please enter numbers of elements wish to add: ");

		Scanner scanInputString = new Scanner(System.in);
		int numberOfElements=0;

		//infinite loop until correct value is entered
		while(true) {

			try {
				String totalNumberOfElements = scanInputString.nextLine();
				final int parsedTotalCount = Integer.parseInt(totalNumberOfElements);
				
				if(parsedTotalCount > 0) {

					numberOfElements =  parsedTotalCount;
					//break the loop when you have found the correct value
					break;
				}	
				
				else {

					//dont know how throw new works

					//throw new NumberFormatException("Negative Integer. Total Count should be only positive integer.");
					System.err.println("Negative Integer. Total Count should be only positive integer.");

					readAndValidateTotalCount();
				}

			}

			catch(NumberFormatException e){
				//System.err.println("Total Count should be only positive integer.");
				readAndValidateTotalCount();
			}
		}//end of while
		return numberOfElements;

	}



	// method to read input elements and convert it into array

	public int[] readArrayElements(int totalArrayElements) {

		int[] inputArray = new int[totalArrayElements];
		Scanner scanElements = new Scanner(System.in);

		int arrayLength = inputArray.length;

		for (int i = 0; i < arrayLength; i++) {

			try {
				System.out.println("Please enter the number at "+i);
				String inputElement = scanElements.nextLine();
				int parsedElement =	Integer.parseInt(inputElement);

				inputArray[i] = parsedElement; 

			}catch (NumberFormatException e) {
				System.err.println("Error: Please enter valid number.");
				//Repeat the step, since it was not successful
				i--;
			}
		}	

		return inputArray;
	}


	//method to perform sum of array elements

	public int addMultipleNumbers(int[] c) {

		System.out.println("Display Array: ");

		int sum = 0;

		for (int i = 0; i < c.length; i++) {

			System.out.println(c[i]);

			sum = sum+c[i];
		}

		return sum;
	}


	//Main method to execute the program

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdditionOfNumbers referenceAddition = new AdditionOfNumbers();

		int inputTotalElements = referenceAddition.readAndValidateTotalCount();

		int b[] = referenceAddition.readArrayElements(inputTotalElements);

		System.out.println("Sum of numbers is: " + referenceAddition.addMultipleNumbers(b));

	}

}