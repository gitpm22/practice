package com.prm.java.practice.javaassignments;

import java.io.File;
import java.io.FileInputStream;

public class ReadFromTextFile {

	
	public void readFileContent(File givenFile, int readTillBytes) {
		
		try {
			
			FileInputStream inputFile = new FileInputStream(givenFile);
			
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
			
			inputFile.close();
			
			
			
			}
			
			else {
				
				System.out.println("File not found");
				
			}
			
			
		}
		
		catch(Exception e) {
			
			System.err.println("Catch Exception");
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
	
		ReadFromTextFile referenceObject = new ReadFromTextFile();
		
		File file = new File("/Users/jradmin/eclipse-workspace/practice/src/main/resources/InputFile.txt");
		referenceObject.readFileContent(file, 4);
		

	}

}
