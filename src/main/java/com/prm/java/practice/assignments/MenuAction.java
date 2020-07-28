package com.prm.java.practice.assignments;

import java.util.Scanner;

/* ##### Java Program #####
 * 
 * Select from below menu:
			1. Add
			2. Multiply
			3. Average
			4. Exit 
		when u enter 1 your program for addition will work
		2. for multiplication
		3 for average
		Calculator Program

 * */


public class MenuAction {

	/*
	 * public int readAndValidateTotalCount() {
	 * 
	 * System.out.println("Please enter total count of numbers: ");
	 * 
	 * Scanner scanTotalCount = new Scanner(System.in);
	 * 
	 * int totalCount = 0;
	 * 
	 * while(true) {
	 * 
	 * try { String inputTotalCount = scanTotalCount.nextLine(); int
	 * parsedTotalCount = Integer.parseInt(inputTotalCount); if(parsedTotalCount>0)
	 * { totalCount = parsedTotalCount; break;
	 * 
	 * } else {
	 * 
	 * throw new
	 * InvalidInput("Negative Integer. Total Count should be only positive integer."
	 * );
	 * 
	 * }
	 * 
	 * }catch(InvalidInput e) {
	 * 
	 * System.err.println(e.getMessage()); readAndValidateTotalCount();
	 * 
	 * }
	 * 
	 * catch(NumberFormatException e) {
	 * 
	 * System.err.println("You have not entered numeric input.");
	 * readAndValidateTotalCount();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * return totalCount;
	 * 
	 * }
	 */


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

	public int displayAndValidateMenuItems() {

		System.out.println("Select from below menu:");
		System.out.println("Enter 1 to add given numbers");
		System.out.println("Enter 2 to Multiply given numbers");
		System.out.println("Enter 3 to find average of given numbers");
		System.out.println("Enter 4 to exit from application");

		Scanner scanMenuOption = new Scanner(System.in);

		MenuAction menuObject = new MenuAction();
		int selectedMenuOption = 0;

		try {
			String inputMenuOption = scanMenuOption.nextLine();
			int parsedMenuOption = Integer.parseInt(inputMenuOption);
			if (parsedMenuOption > 0 && parsedMenuOption <=4) {

				selectedMenuOption = parsedMenuOption;
			}			

		}
		catch(NumberFormatException e) {

			System.err.println("Please enter valid menu Option");

		}


		return selectedMenuOption;	

	}

	public void performAction(int[] array, int menuChoice) {

		MenuAction menuObject1 = new MenuAction();

		int sum = 0;

		try {

			switch(menuChoice) {

			case 1:{				

				System.out.println("Sum = " + menuObject1.addInputNumbers(array));

				break;
			}
			case 2: {

				System.out.println("Multiply = " + menuObject1.multiplyInputNumbers(array));

				break;}

			case 3: {

				System.out.println("Average = " + menuObject1.averageOfInputNumbers(array));

				break;}

			case 4: {

				//System.out.println("Exit = ");

				menuObject1.exit();

				break;}		

			}

		}
		catch(NumberFormatException e){

			System.err.println("Wrong output ");
		}


	}

	public int addInputNumbers(int[] givenArray) {	

		int sum = 0;

		for(int i=0; i<givenArray.length;i++) {

			sum = sum + givenArray[i];
		}

		return sum;
	}

	public int multiplyInputNumbers(int[] givenArray) {	

		int multiplication = 1;

		for(int i=0; i<givenArray.length;i++) {

			multiplication = multiplication * givenArray[i];			
		}

		return multiplication;
	}

	public int averageOfInputNumbers(int[] givenArray) { 

		MenuAction menuObject3 = new MenuAction();

		int sum = menuObject3.addInputNumbers(givenArray);

		int average = sum/(givenArray.length);

		return average;
	}

	public void exit() {

		System.exit(0);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Menu Action Program.");

		MenuAction referenceObjectOfMenuAction = new MenuAction();

		int totalNumberOfInputElements = referenceObjectOfMenuAction.readAndValidateTotalCount();

		//System.out.println(totalNumberOfInputElements);

		int[] b = referenceObjectOfMenuAction.readAndValidateInputNumbers(totalNumberOfInputElements);

		referenceObjectOfMenuAction.displayArray(b);	

		int menuOption = referenceObjectOfMenuAction.displayAndValidateMenuItems();

		referenceObjectOfMenuAction.performAction(b,menuOption);
	}

}
