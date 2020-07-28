package com.prm.java.practice.other;

/*########## Discuss about different type of Variables available in Java ##########*/

/*########## Rules for Non-Static Variables ##########*/

/* 
 * 1. Non-Static Variables cannot used using CLASSNAME
 * 2. Always need to instantiate(create object) to access non-static variables
 * 3. Every object has its own copy
 * 4. They can only be used from non static methods directly, in order to use from static method u need an instance first
 * 5. Non- Static variables need not to be initialized before they can be used, as it used in case of local variables
 * 6. STATIC variables ==> BOTH STATIC AND NON STATIC Methods
 * 7. Non STATIC variables ==> Only NON STATIC Methods directly
*/	
	
/*########## Rules for Static variables ##########*/

/*
 * 1. They do not need any object to access, CLASS_NAME.VARIABLE_NAME
 * 2. Even when used with object that doesn't mean it is part of object, it is still one single GLOBAL copy obj.VARIABLE_NAME = CLASS.VARIABLE_NAME
 * 3. STATIC variables can be used from both static methods or non-static methods.
 * 4. Static variables need not to be initialized before they can be used, as it used in case of local variables
*/	

public class DifferentVariablesInJava {

	public DifferentVariablesInJava() {
		
		// TODO Auto-generated constructor stub
		
		int constructorVariable = 15;
		
	}

	/* Non- Static Variable Declaration:
	 * 1. Below variable is INSTANCE VARIABLE as it is outside any method
	 * 2. It is not using STATIC modifier with it and using default access modifier.
	 */
	
	/* Notes:
	 * 1. Primitive Data types --> int, float, short, double, char, boolean
	 * 2. Access specifier --> Private, public, protected, default (if nothing is mentioned then it is default)
	 * 3. ==> STATIC
	 */

	
	
	/*5. Non- Static variables need not to be initialized before they can be used, as it used in case of local variables*/
	
	int instanceVariable = 10;
	
	/* Static Variable Declaration:
	 * 1. Below variable is STATIC variable as it is outside any method
	 * 2. It is using STATIC modifier with it and using default access modifier.
	 */
	
	/*4. Static variables need not to be initialized before they can be used, as it used in case of local variables*/
	
	static String staticVariable = "static";
	
	/* Local Method Definition and Method body
	 * 1. Parameterized Method 
	 * 2. It will return a value as void is mentioned
	 */
	
	
	/* 4. They can only be used from non static methods directly, in order to use from static method u need an instance first*/
	
	public void nonStaticMethod(int value1){
		
		if (value1 == 1){
			System.out.println("instanceVariable can only be used from nonStaticMethod method directly --> instanceVariable " + instanceVariable);
		}
		else{
						
			System.out.println("STATIC variables can be used from nonStaticMethod methods --> staticVariable " + staticVariable);
		}		
	}
	
	
	public static void staticMethod(int value2){
		
		if(value2 == 1){
			
			System.out.println("In order to use instanceVariable from StaticMethod method you need an instance first --> new DifferentVariablesInJava().staticVariable " + new DifferentVariablesInJava().staticVariable);
			System.out.println("In order to use instanceVariable from StaticMethod method you need an instance first --> staticVariable " + staticVariable);
			
		}
		else{
			
			System.out.println("STATIC variables can be used from StaticMethod methods --> staticVariable " + staticVariable);
			
		}
		
		
	}
		
	public void localVariableMethod(int itIslocalVariable) {
		/*
		 * 1. Below variable is LOCAL VARIABLE as it is defined inside method in class.
		 * 2. Only modifier that can be applied on local variable is FINAL.
		 * 3. Local variables need to be initialized before they can be used which is not true for Static or Instance variables.
		 */
		
		
		int localVariable =  1 ;
		System.out.println("Initial Value of Local Variable" + localVariable);
	}
	
	
	public String getName(){
		
		return "Kuhu";
		 		
	}
	
	public static void main(String args[]) {
		
		/*########## Rules for Non-Static Variables ##########*/		
		
		/* 3. Every object has its own copy
		 * 6. ? STATIC variables/methods ==> BOTH STATIC AND NON STATIC Methods
			 *  directly (without creating object, in same class. For other class you 
			 *  must use CLASS_NAME.METHOD_NAME)
		 * 7. ? Non STATIC variables/ methods ==> Only NON STATIC Methods directly
		*/
		
		
		/*1. Non-Static Variables cannot used using CLASSNAME*/
		
		//System.out.println("1. Non-Static Variables cannot used using CLASSNAME --> DifferentVariablesInJava().instanceVariable not allowed and throws error" + DifferentVariablesInJava().instanceVariable);
		
		/*
		 * 2. Always need to instantiate(create object) to access non-static variables
		 * Meaning Instance variable can only be accessed by Object of the class only as below.
		 */
		
		
		System.out.println("Instance variable can only be accessed by Object of the class --> new DifferentVariablesInJava().instanceVariable " + new DifferentVariablesInJava().instanceVariable);
		
		
		DifferentVariablesInJava obj = new DifferentVariablesInJava();
		System.out.println("Instance variable can only be accessed by Object of the class --> obj.instanceVariable " + obj.instanceVariable);
		
		/*4. Instance Variables can only be used from non static methods directly in this case 
		 * instanceVariable can only be used from nonStaticMethod method directly
		 * in case of nonStaticMethod method you need to create instance to access the non static method.
		 */

		obj.nonStaticMethod(1);
		
		/*4.In order to use instanceVariable from StaticMethod method you need an instance first --> new DifferentVariablesInJava()
		 * in case of staticMethod method you need not to mention object reference and can use it directly
		 * */
		
		
		DifferentVariablesInJava.staticMethod(1);
		
		/*########## Rules for Static variables ##########*/

		/*
		 * Static field can be accessed in two way.
		 * 1. Static field can be accessed Via Object of the class --> Even when used with object that doesn't mean it is part of object, it is still one single GLOBAL copy. obj.VARIABLE_NAME == CLASS.VARIABLE_NAME
		 * 2. Static field can be accessedVia CLASS name --> They do not need any object to access, CLASS_NAME.VARIABLE_NAME
		 */
				
		System.out.println("Static field can be accessed Via Object of the class --> Even when used with object that doesn't mean it is part of object, it is still one single GLOBAL copy. obj.VARIABLE_NAME == CLASS.VARIABLE_NAME " + obj.staticVariable);
		System.out.println("Static field can be accessedVia CLASS name --> They do not need any object to access, CLASS_NAME.VARIABLE_NAME " + DifferentVariablesInJava.staticVariable);

		/*3. STATIC variables can be used from both static methods or non-static methods.*/
		
		obj.nonStaticMethod(2);
		staticMethod(2);
		
		/* Local Variable*/
				
		System.out.println("Access Local Variables via public method"); 
		obj.localVariableMethod(2);
		
		/*Constructor Variable*/
		
		//obj.DifferentVariablesInJava();
		
		String val = obj.getName();
		
		System.out.println("Public Method returns String value " + val);
		
	}


}
