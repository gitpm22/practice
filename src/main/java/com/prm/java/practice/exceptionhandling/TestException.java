package com.prm.java.practice.exceptionhandling;

public class TestException {



	public static void throwT1(Boolean flag ) throws T1{

		System.out.println(" Throwing from throwT1");

		if (flag)

			throw new T1();

		System.out.println("continue");

	}


	public static void throwEx2( ) throws Ex2{
		System.out.println(" Throwing from throwEx2");
		throw new Ex2();

	}

	public static void throwEr2( ) throws Er2{

		System.out.println(" Throwing from throwEr2");

		throw new Er2();
	}

	public static void throwR1( ) throws R1{


		System.out.println(" Throwing from throwR1");

		throw new R1();
	}
	public static void throwR2( ) throws R2{
		System.out.println(" Throwing from throwR2");

		throw new R2();

	}

	public static void testMethod() throws T1, Ex2 {
		try {
			throwR2();
			throwR1();

		}
		catch(R2 r2) {

			System.out.println("Caught R2");
			double d = 1/0;
			//System.exit(0);
			//throw new R1();

		}
		catch(R1 r1) {

			//System.out.println("Caught R1");
			//throw new R2();

		}
		finally {

			System.out.println("R2 Finally");
		}
		throwT1(false);
		throwEx2();
		throwEr2();






	}

	public static void main(String[] args) {


		TestException obj = new TestException();

		try{

			System.out.println("Before calling test method");
			obj.testMethod();
			System.out.println("After calling test method");
		}

		catch(T1 t) {

			System.out.println("Caught T1");

		}
		catch(Ex2 ex) {
			System.out.println("Caught Ex2");

		}

		//		catch(Throwable t) {
		//			System.out.println("Caught T");
		//			
		//			
		//		}
		finally{

			System.out.println("I am outside Finally");

		}

	}


}
