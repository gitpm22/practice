package com.prm.java.practice.lambda;

public class FirstLambda {

	public static void main(String[] args) {

		MyInterfaces obj = new MyInterfacesImpl();
		obj.deliverMsg("Hello!");
		
		MyInterfaces lambda = s -> System.out.println("X"+s);
		
		MyInterfaces anonymous = new MyInterfaces() {
			
			@Override
			public void deliverMsg(String msg) {
				System.out.println("Anonymous "+msg);
			}
		};
		
		lambda.deliverMsg("WOW!!");
		
	}
	

	

}

interface MyInterfaces {
	
	void deliverMsg(String msg);
	
}





class MyInterfacesImpl implements MyInterfaces {

	public void deliverMsg(String msg) {
		
		System.out.println("Mr "+msg);
	}
	
	
}
