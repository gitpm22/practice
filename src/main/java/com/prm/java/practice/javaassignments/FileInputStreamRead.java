package com.prm.java.practice.javaassignments;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamRead {

	public static void main(String[] args) {
		
		File givenFile = new File("/Users/jradmin/eclipse-workspace/practice/src/main/resources/InputFile.txt");
		
		
		try {
			FileInputStream fileInputStream = new FileInputStream(givenFile);
			
			int contentLength = fileInputStream.available();
			
			System.out.println("Total Available bytes in file: " + contentLength);
			
			/*
			 * byte[] b = new byte[contentLength]; int i = fileInputStream.read(b, 0, 11);
			 * 
			 * System.out.println("Number of bytes in read from file: " + i); for (byte bs :
			 * b) { char c = (char) bs; if (bs == 0) { c = '-'; } System.out.print(c); }
			 */
			byte[] b = new byte[contentLength];
			
			for (int i = 0; i< contentLength; i++ ) {
				
				char fileContentCharacters = (char) b[i];
				
				System.out.print(fileContentCharacters);
			}
			
			
			
			int readBytes = fileInputStream.read(b, 0, 11);
			System.out.println("Please read first " + readBytes + " bytes from the file.");
			
			for (int i = 0; i< b.length; i++ ) {
				
				char contentCharacters = (char) b[i];
				
				System.out.print(contentCharacters);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
