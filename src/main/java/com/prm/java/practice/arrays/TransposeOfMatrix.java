package com.prm.java.practice.arrays;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		System.out.println("Enter dimension of matrix rows followed by columns:");
		
		Scanner inputArray = new Scanner(System.in);
		
		 int rows = inputArray.nextInt();
		 int columns = inputArray.nextInt();
		 
		 int[][] squareMatrix = new int[rows][columns];
		 
		 int sumOfArrayElements = 0;
		 
		 System.out.println("Enter the values"+"\n");
		 
		 for (int i=0; i<rows;i++) {
			 
			 for(int j=0;j<columns;j++) {
				 
				 squareMatrix[i][j] = inputArray.nextInt();
				 
				 System.out.print("");
			 }			 
			 
		 }	 
		
		
		System.out.println("Given Matrix:");

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				System.out.print(squareMatrix[i][j] + "\t");
				
				sumOfArrayElements += squareMatrix[i][j];

			}

			System.out.println(" ");
		}
		
		System.out.println("Sum of all Elements in the Matrix is :" +sumOfArrayElements);
		System.out.println("Total elements in the matrix:" + rows*columns);
		
		// Method 1 without assigning values and Just printing:
		System.out.println("Transpose of Above Matrix without assigning values and Just printing is: ");

		for (int i = 0; i < columns ; i++) {

			for (int j = 0; j < rows ; j++) {
		
				System.out.print(squareMatrix[j][i] + "\t");	
			}
			
			System.out.println("");

		}
		
				
		// Method 2 Actually assigning values using two Arrays:

		
		int[][] transposeMatrix = new int[columns][rows];
			
		System.out.println("Transpose of Above Matrix assigning values using two Arrays is: ");

		for (int i = 0; i < columns ; i++) {

			for (int j = 0; j < rows ; j++) {

				transposeMatrix[i][j] = squareMatrix[j][i];
		
				System.out.print(transposeMatrix[i][j] + "\t");
				
			}
			
			System.out.println("");

		}


	}
}
