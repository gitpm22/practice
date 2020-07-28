package com.prm.java.practice.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortEmployees implements Comparable{

	private String name;
	
	private int id;
	
	private double salary;


	public SortEmployees(String name, double salary) {
	
		super();
		
		this.name = name;
		this.salary = salary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Object o) {
		
		SortEmployees emp = (SortEmployees) o;
		
		return this.name.compareTo(emp.getName());
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<SortEmployees> emp = new ArrayList<SortEmployees>();
		
		emp.add(new SortEmployees("Preeti", 1000.00));
		emp.add(new SortEmployees("Abhi", 2000.00));
		emp.add(new SortEmployees("Kuhu", 9000.00));
		emp.add(new SortEmployees("Aadya", 7000.00));
		
		//  ArrayList<SortEmployees>
		
		System.out.println(emp);
		
		Collections.sort(emp);
		
		
		System.out.println(emp);
		
		Collections.sort(emp, new SalaryComparator());
		System.out.println(emp);
		
	}

	@Override
	public String toString() {
		return "\nSortEmployees [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
}
