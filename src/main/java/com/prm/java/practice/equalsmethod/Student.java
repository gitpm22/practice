package com.prm.java.practice.equalsmethod;

public class Student {
	
	
	private String name;
	private int id;
	
	Student(String name){
		
		this.name = name;
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


	// override equals method of object class to check whether two objects are same
	public boolean equals(Object obj) {
		
		
		// type casting to parent 
		
		//return this.name.equals(((Student)(obj)).getName());
		
		Student b = (Student) obj; // type cast
		
		return this.name.equals(b.getName());
	
	}



	

}
