package com.prm.java.practice.literals;

public class Literal {
	
//	literals :  fixed values assigned to a variable
//	there are 8types of literals : char, boolean, byte, short, int, long, float, double
	
	/* The standard Java integer data types are:

		byte 1 byte  -128 to 127
		short 2 bytes  -32,768 to 32,767
		int 4 bytes -2,147,483,648 to 2,147,483,647
		long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

	 * */
	
	
	// byte byteLiteralStartingLimitInvalidValue = -129; // compilation error as out of limit
	byte byteLiteralStartingLimitValidValue = - 128;
	byte byteLiteralEndingLimitValidValue = 127;
	// byte byteLiteralEndingLimitInvalidValue = 128; // compilation error as out of limit
	
	
	// short shortLiteralStartingLimitInvalidValue = -32769; // compilation error as out of limit , it is integer value
	short shortLiteralStartingLimitValidValue = -32768;
	short shortLiteralEndingLimitValidValue	= 32767;	
	//short shortLiteralEndingLimitInvalidValue = 32768; // compilation error as out of limit, cannot convert from int to short		
			
	// int intLiteralStartingLimitInvalidValue = -2147483649; // compilation error as out of limit
		int intLiteralStartingLimitValidValue = - 2147483648;
		int intLiteralEndingLimitValidValue = 2147483647;
	// int intLiteralEndingLimitInvalidValue = 2147483648; // compilation error as out of limit
		
		/* integer has 4 types of literal : Decimal, Binary, Octal, hexadecimal*/
	//decimal Literal

		int decimal = 100_00_00; // legal Decimal literal
	//	int deci = _1000; // illegal decimal literal
		
	//	int dec = 100_00_; // illegal decimal literal
		
		float dec1 = 1_0_00.0f; // legal decimal literal for float data type
		
		//float dec2 = 1_00_00_.0_f; //illegal decimal literal for float
		
		//Binary Literals
		
		
		
		
		
		
		
		
}
