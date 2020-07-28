package com.prm.java.practice.assignments;

public class ArraySort {

	public static void main(String[] args) {
		
		
		int[] array = {3,2,1};
		
		
		for(int i=0; i< array.length;i++) {
			
			for(int j = i+1; j<array.length;j++) {
				
				if(array[j]<array[i]) {
					
				int	temp = array[i];
					
					array[i] = array[j];
					
					array[j] = temp;
				}
				
				System.out.println(array);
				
			}
			
			
			
		}

	}

}
