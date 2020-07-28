/*Package Definition*/

package com.prm.java.practice.other;

import static com.prm.java.practice.other.DifferentVariablesInJava.*;

import com.prm.java.practice.other.App;
import com.prm.java.practice.other.SecondJava;

public class ImportDefinition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		App ObjApp = new App();
		
		System.out.println("Instance of App.Java class returns import path" + "\t" + ObjApp);
		
		App printObj = new App();
		
		printObj.PrintText();
		
		SecondJava ObjSecondJavaSame = new SecondJava();
		
		System.out.println("Instance of SecondJava.java within same package returns import path" + "\t" + ObjSecondJavaSame);
		
		
		/*Fully Qualified Name*/
		
		com.prm.java.practice.two.SecondJava ObjSecondJavadifferent = new com.prm.java.practice.two.SecondJava();
		
		System.out.println("Instance of SecondJava.java within different package returns import path" + "\t" + ObjSecondJavadifferent);
		
		// Imported staticMethod() from DifferentVariablesInJava Class
		
		staticMethod(1);
		
	}
}
