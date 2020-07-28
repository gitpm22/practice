/*
 * 1. Compiler compile the <.Java> file and generate the byte Code which is in form of <.class> file 
 * 2. Java Virtual Machine (JVM) then process the <.class> file and run on particular operating system eg. Windows, Mac, Linux
 * 3. There are different JVMs for each operating system however but generates same <.class> file
 * 4. Public is access specifier means the main method is available to all.
 * 5. Static represents, the main method 
 * */



package com.prm.java.practice.other;

public class TestMainMethod {

	public static void main(String[] args){
		
		System.out.println("Hello: " + args[0] + "," + args[1] + "," + args[2]);
		
		//System.out.println("Argument: " + args);
	}
}
