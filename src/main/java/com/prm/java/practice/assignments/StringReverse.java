package com.prm.java.practice.assignments;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String inputString = "Abhi";

		char[] charArray = inputString.toCharArray();

		System.out.println(charArray.length);

		//String op ="";
		
		StringBuffer sbb = new StringBuffer();
		
		for(int i=charArray.length - 1; i >=0; i--) {
			
			//System.out.print(charArray[i]);
			//op=op.concat(""+charArray[i]);
			
			sbb.append(charArray[i]);

		}
		
		System.out.println(sbb);
		
		scan.close();

	}

}
