package com.prm.java.practice.forloop;

import java.util.Scanner;

public class MultipleOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your UserName: ");

		Scanner input1 = new Scanner(System.in);
		String userName = input1.nextLine();
		System.out.println("Your currect username is:" + userName);
		
		System.out.println("Enter any number:");
		Scanner input2 = new Scanner(System.in);
		//String number = input2.nextLine();
		int number =input2.nextInt();
		System.out.println("Entered number: "+ number);
		System.out.println("Multiples of this number:");
		
		
		/*if (un == "p"){
			System.out.println("Matching");
		}
		else
		System.out.println("Please enter correct username");
		*/
		
		
		for (int i = 1 ; i<=10; i++){
			System.out.println(i + "*" + number + "=" + (i*number));
		}
		
	}

}
