package com.prm.java.practice.fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	
	public int readFromFile(String filePath) {
		int fileContent = 0;
		
		try {
			
			File file = new File(getClass().getClassLoader().getResource(filePath).getFile());
			
			
			BufferedReader br = new BufferedReader(new FileReader(file));	
			String line = br.readLine();
			System.out.println("Output from FileManager" + line);
			
			fileContent = Integer.parseInt(line);
			
			
			br.close();
			
		}
		catch(FileNotFoundException ex) {
			
			System.out.println("Catched FileNotFoundException");
			
		}
		catch(IOException ex) {
			
			System.out.println("Catched IOException");
		}
		finally{
			
			
		}
		return fileContent;
	}
	
	public void writeToFile(String c, int d) {
		try {
			File file = new File(getClass().getClassLoader().getResource(c).getFile());
			
			FileWriter writeTo = new FileWriter(file);
			
			String e = Integer.toString(d);
			writeTo.write(e);
			writeTo.flush();
			
			writeTo.close();
		}
		
		catch(FileNotFoundException ex) {
			System.out.println("Catched FileNotFoundException");
			
		}
		catch(IOException ex) {
			
			System.out.println("Catched IOException");
			
		}
		
	}

}
