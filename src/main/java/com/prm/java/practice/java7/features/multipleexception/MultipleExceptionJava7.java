package com.prm.java.practice.java7.features.multipleexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MultipleExceptionJava7 {


	public void readFileContent(File givenFile, int readTillBytes) throws IOException, ArrayIndexOutOfBoundsException {

		// try with resources is java 7 feature try(resource){}
		try(FileInputStream inputFile = new FileInputStream(givenFile)) {

			//FileInputStream inputFile = new FileInputStream(givenFile);

			if (inputFile!= null) {

				int fileContentLength = inputFile.available();
				System.out.println("File Content Length : " + fileContentLength);

				byte[] fileContentArray = new byte[fileContentLength];

				System.out.println("\n" + "Please read first " + readTillBytes +
						" bytes from the file.");

				int fullFileContent = inputFile.read(fileContentArray, 0, fileContentLength);

				for(int i= 0; i< readTillBytes; i++){

					char fileContent = (char) fileContentArray[i];

					System.out.print(fileContent);

				}

				//inputFile.close(); // commented as using try with resources JVM automatically closes mentioned open resources
			}
			//			
			//			else {
			//				
			//				System.out.println("File not found");
			//				
			//			}


		}

		catch( IOException | ArrayIndexOutOfBoundsException ex) {
			
			//ex.printStackTrace();

			System.err.println("Catched IOException Exception"); 
			// in case we want exceptions as per their type then use multiple catch within this method 
			
		}
	}



	public static void main(String[] args) throws IOException {

		MultipleExceptionJava7 referenceObject = new MultipleExceptionJava7();

		File file = new File("/Users/jradmin/eclipse-workspace/practice/src/main/resources/InputFile.txt");
		referenceObject.readFileContent(file, 7);
		
		// Java 7 features
		
		byte binaryNum = 0B00011; // binary numbers indicated with 0b or 0B
		int intLiteral = 1_00_000; // integer literals --> underscore can be added in between the numbers but cant be added at start and end of the literal.
		// Float literal --> underscore can be added in between the numbers but cant be added at start and end of the literal.
		// Also it can't be allowed before and after . (dot) symbol in floating point numbers 
		
		System.out.println("\n" + binaryNum + "\n"+ intLiteral + "\n");
		
		
		
		


	}

}

