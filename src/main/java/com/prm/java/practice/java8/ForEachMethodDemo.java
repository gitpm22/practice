package com.prm.java.practice.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		
		int[] array = {1,2,3};
		
		//forEach Loop
		
		System.out.println("For Loop Values: ");
		
		for (int i : array) {
			
			System.out.println(i);
		}
		
		//forEach method introduced in java 8 and can be used in collections
		
		List<Integer> arr = Arrays.asList(1,2,3,4);
		
		System.out.println("For Each method values using collections");
		
		arr.forEach(i-> System.out.println(i));
}
}
