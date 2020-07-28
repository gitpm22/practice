package com.prm.java.practice.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	
	public int readFromFile(String filePath) {
		int fileContent = 0;
		File file = new File(getClass().getClassLoader().getResource(filePath).getFile());
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			//File file = new File(getClass().getClassLoader().getResource(filePath).getFile());
			
			//BufferedReader br = new BufferedReader(new FileReader(file));	
			
			String line = br.readLine();
			System.out.println("Output from FileManager" + line);
			
			fileContent = Integer.parseInt(line);
			
			
		}
		catch(IOException ex) {
			
			System.out.println("Catched FileNotFoundException");
			
		}

		return fileContent;
	}
	
	public void writeToFile(String c, int d) {
		File file = new File(getClass().getClassLoader().getResource(c).getFile());
		// try with resources - java 7 feature
		try (FileWriter writeTo = new FileWriter(file)){
			
			String e = Integer.toString(d);
			writeTo.write(e);
			writeTo.flush();
			
		}
		catch(IOException ex) {
			
			System.out.println("Catched IOException");
			
		}
		
	}

}
