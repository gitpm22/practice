package com.prm.java.practice.fileOperations;

public class TestFileManager {

	public static void main(String[] args) {
		
		FileManager refOfFileManager = new FileManager(); 
		
		Calculator calc = new Calculator();
		
		String filePathOfa = "a.txt";
		String filePathOfb = "b.txt";
		String filePathOfc = "c.txt";
		
		int a = refOfFileManager.readFromFile(filePathOfa);
		
		System.out.println("output from testmanager " + a);
		
		int b = refOfFileManager.readFromFile(filePathOfb);
		
		System.out.println("output from testmanager " + b);
		
		
		int c = calc.calculate(a,b);
		
		System.out.println("calculated value " + c);
		
		refOfFileManager.writeToFile(filePathOfc, c);
		
		int d = refOfFileManager.readFromFile(filePathOfc);
		
		System.out.println("output from testmanager " + d);

	}

}
