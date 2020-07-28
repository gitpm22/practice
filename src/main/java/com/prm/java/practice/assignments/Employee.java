package com.prm.java.practice.assignments;

public class Employee {

	int id;
	String name;
	float Salary;
	String city;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	
	}



	public float getSalary() {
		return Salary;
	}



	public void setSalary(float salary) {
		Salary = salary;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}

	

	public Employee(int id, String name, float salary, String city) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.city = city;
	}

    public boolean equals(Object obj) {
    	
    	Employee e = (Employee) obj;
    	
    	return this.name.equals(e.getName());
    	
    	
    }

}
