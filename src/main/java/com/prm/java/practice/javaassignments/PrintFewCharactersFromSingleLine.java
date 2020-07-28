package com.prm.java.practice.javaassignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PrintFewCharactersFromSingleLine {	

	public void readAndValidateTextFile(File givenFile){
		
		
		try {

			FileInputStream inputFile = new FileInputStream(givenFile);					

			if (givenFile!=null) {

				int fileContentLength = inputFile.available();

				System.out.println("Total available bytes in file: " + fileContentLength);

				byte[] fileContentBufferOrArray = new byte[fileContentLength];

				int readFullContent = inputFile.read(fileContentBufferOrArray, 0, fileContentLength);
				
				  for (int i = 0; i< fileContentLength; i++ ) {
				  
				  char fileContentCharacters = (char) fileContentBufferOrArray[i];				  
				 			  
				  System.out.print(fileContentCharacters);
				  }
				 
				// Instead of for you use while loop as below

				/*
				 * int content;
				 * while ((content = inputFile.read()) != -1) { // convert to char and display
				 * it
				 * 
				 * char characters = (char) content; System.out.print(characters);
				 * 
				 * 
				 * }
				 */
				  
				  inputFile.close();

			}
			else {
				System.err.println("Error: File Not Found");

			}

		}
		catch (Exception e) {

			System.out.println("Error");
		}

	}


	public void readSomeContentFromSingleLine(File givenFile, int readTillBytes){
		
		try {

			FileInputStream inputFile = new FileInputStream(givenFile);					

			if (givenFile!=null) {

				int fileContentLength = inputFile.available();

				byte[] fileContentBufferOrArray = new byte[fileContentLength];

				int readFullContent = inputFile.read(fileContentBufferOrArray, 0, readTillBytes);

				System.out.println("\n" + "Please read first " + readTillBytes +
						" bytes from the file.");

				for (int i = 0; i< readTillBytes; i++ ) {

					char contentCharacters = (char) fileContentBufferOrArray[i];

					System.out.print(contentCharacters); }
				
				inputFile.close();

			}
			else {
				System.err.println("Error: File Not Found");

			}

		}
		catch (Exception e) {

			System.out.println("Error");
		}		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintFewCharactersFromSingleLine referenceObject = new PrintFewCharactersFromSingleLine();

		File givenFile = new File("/Users/jradmin/eclipse-workspace/practice/src/main/resources/InputFile.txt");

		referenceObject.readAndValidateTextFile(givenFile);
		referenceObject.readSomeContentFromSingleLine(givenFile, 5);
	}

}
