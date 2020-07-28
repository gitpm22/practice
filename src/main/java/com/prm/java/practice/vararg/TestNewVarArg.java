package com.prm.java.practice.vararg;

import java.util.Scanner;

import com.prm.java.practice.assignments.MenuAction;

public class TestNewVarArg {

	public static void main(String[] args) {

		System.out.println("Welcome to Menu Action Program.");

		NewVarArg referenceObjectOfMenuAction = new NewVarArg();

		int totalNumberOfInputElements = referenceObjectOfMenuAction.readAndValidateTotalCount();

		//System.out.println(totalNumberOfInputElements);

		int[] b = referenceObjectOfMenuAction.readAndValidateInputNumbers(totalNumberOfInputElements);

		referenceObjectOfMenuAction.displayArray(b);	
		referenceObjectOfMenuAction.show(b);

	}

}
