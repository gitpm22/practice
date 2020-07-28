package com.prm.java.practice.assignments;

import java.util.Scanner;

public class CountVowelsInString {

	public static void main(String[] args) {
		int count = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the string");

		String inputString = scan.nextLine();

		char[] charArray = inputString.toCharArray();

				for(char i : charArray) {
					
					switch(i){
					
					case 'a':
					case 'A':
					case 'e':
					case 'E':
						
					case 'i':
						
					case 'I':
					case 'o':
					case 'O':
					case 'u':
					case 'U':
						count++;
	
					}
					
				}

		//		for(int i=0; i<charArray.length; i++) {
		//			
		//			if(charArray[i] == 'a'
		//					|| charArray[i] == 'e'
		//					|| charArray[i] == 'i'
		//					|| charArray[i] == 'o'
		//					|| charArray[i] == 'u') {
		//				
		//				count++;
		//				
		//			}
		//		}

//		for(int i=0; i<charArray.length;i++) {
//
//			if(charArray[i] == 'a'){
//
//				count++;
//
//			}
//			else if (charArray[i] == 'e') {
//				count++;
//
//			}
//			else if (charArray[i] == 'i') {
//				count++;
//
//			}
//			else if (charArray[i] == 'o') {
//				count++;
//
//			}
//			else if (charArray[i] == 'u') {
//				count++;
//
//			}
//
//		}

		System.out.println("Count: "+ count);
		scan.close();

	}

}
