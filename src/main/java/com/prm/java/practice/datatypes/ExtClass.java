package com.prm.java.practice.datatypes;

public class ExtClass {

	public static void main(String[] args) {

		DemoDataTypes obj = new DemoDataTypes();
		obj.pubIntNumber=1000;
		//obj.setIntNumber(-1000);
		System.out.println(obj.staticInt+" "+obj.pubIntNumber+" "+obj.getIntNumber());
		DemoDataTypes.staticInt=10;
		
		DemoDataTypes obj2 = new DemoDataTypes(3000, -4000);
		//obj2.pubIntNumber=2000;
		obj2.setIntNumber(-1000);
		
		System.out.println(obj2.staticInt+" "+obj2.pubIntNumber+" "+obj2.getIntNumber());
	

	}

}
