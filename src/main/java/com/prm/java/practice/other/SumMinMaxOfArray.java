package com.prm.java.practice.other;

public class SumMinMaxOfArray {
	
	public static void main(String[] args) {
		
		int[] array = {23,2,7,11,34,56,78};
		
		//array = {23,2,7,11,34,56,78};
		
		int min = array[0];
		int max = array[0];
		int sum = 0;
		float average = 0;
			
		for (int i=0; i < array.length; i++){
			
			int currentValue = array[i];
			
			if (currentValue < min){
				
				min = currentValue;
				
						
			}
		
			else{
				
				max = currentValue;
			}
			
			sum = sum + array[i];
			
			
		}
		
		average = (float)sum/array.length;
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(average);
		System.out.println(sum/array.length);
		
	}

}
