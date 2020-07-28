package com.prm.java.practice.assignments;

import java.util.Comparator;

public class SalaryComparator implements Comparator<SortEmployees> {

	@Override
	public int compare(SortEmployees o1, SortEmployees o2) {
		
		if(o1.getSalary()>o2.getSalary()) {
			
			return -1;
		}
		else if(o1.getSalary()< o2.getSalary()) {
			
			return 1;
		}
		
		return 0;
	}

}
