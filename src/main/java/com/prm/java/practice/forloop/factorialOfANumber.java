package com.prm.java.practice.forloop;
import java.util.Scanner;

public class factorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any number:");
		Scanner scannerObject = new Scanner(System.in);
		int input = scannerObject.nextInt(); 
		
		
		int number = 1;
		for (int i=1;i<=input;i++){
			
			System.out.print(i + " X " );
			
			number = number * i;
		}		
		System.out.println("");
		System.out.println("Factorial of number:" + input + "-->" + number);
		
	}

}
