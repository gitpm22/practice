package com.prm.java.practice.anonymousclass;

// Outer Class

public class AbhiDecendent{
	
	public void abhisChildren() {
		
		System.out.println("Abhis Daughter: Aadya");
	}

}


class Preeti{
	
	
	//Anonymous Inner Class
	AbhiDecendent baby = new AbhiDecendent() {
		
		public void abhisSon() {
			
			System.out.println("Abhis Son : Aahaan");
		}
		
		public void abhisChildren() {
			
			System.out.println("Abhis child: Kuhu");
		}

		
	};
	
	
}

