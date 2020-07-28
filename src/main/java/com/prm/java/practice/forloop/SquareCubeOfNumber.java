package com.prm.java.practice.forloop;

import java.util.Scanner;

public class SquareCubeOfNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Please enter any number which Square and Cube needs to find: ");
		Scanner scannerObject = new Scanner(System.in);
		int input1 = scannerObject.nextInt();
		
		System.out.println("Below are the Square and Cube of : " + input1);
		int number = 1;
		
		for(int i=1; i<=4;i++){
			number = number * input1;
			System.out.println(number);
			
			
		}

	}

}
