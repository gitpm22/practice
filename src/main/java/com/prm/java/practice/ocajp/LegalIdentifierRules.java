package com.prm.java.practice.ocajp;

public class LegalIdentifierRules {

	public static void main(String args[]){

		$DollorClass1 $ObjectDollar = new $DollorClass1();

		$ObjectDollar.$getDollarValueMethod();

		_UnderscoreClass1 _ObjectUnderscore = new _UnderscoreClass1();

		_ObjectUnderscore.$getUnderscoreValueMethod();

		lowercaseLetterClass1 lowercaseObject = new lowercaseLetterClass1();

		lowercaseObject.$getLowerCaseLetterMethod();
		
		IllegalIdentifiers1 objIllegal = new IllegalIdentifiers1();
		
		objIllegal.getIllegalIdentifiers();
		
		CaseSensitiveIdentifiers objCaseSensitive = new CaseSensitiveIdentifiers();
		
		objCaseSensitive.getCaseSentitiveIdentifier();

	}	
}

// Legal Identifier must start with $ CURRENCY character.

class $DollorClass1{

	int $dollarVariable=1;

	public void $getDollarValueMethod(){

		System.out.println("Legal Identifier must start with $ CURRENCY character." +"\n" + "$dollarVariable contains value : " + $dollarVariable + "\n");
	}

}

//Legal Identifier must start with UNDERSCORE character.

class _UnderscoreClass1{

	int _UnderscoreVariable=2;

	public void $getUnderscoreValueMethod(){

		System.out.println("Legal Identifier must start with UNDERSCORE character." +"\n" + "_UnderscoreVariable contains value : " + _UnderscoreVariable + "\n");

	}	
}

//Legal Identifier must start with LOWERCASE character.

class lowercaseLetterClass1{

	int lowercaseLetterVariable=3;

	public void $getLowerCaseLetterMethod(){

		System.out.println("Legal Identifier must start with LOWERCASE character." +"\n" + "lowercaseLetterVariable contains value : " + lowercaseLetterVariable +"\n");

	}

}

/* Illegal Identifiers : Keywords like class, for , if, while, public, protected, etc.
 * You cant use keywords as identifiers
 * */

class IllegalIdentifiers1{
	
/*	int :Colon;
	int -Hyphen;
	int e#Hash;
	int .Dot;
	int 5Five;
*/
		
	public void getIllegalIdentifiers(){
		
		System.out.println("Illegal Identifiers: Keywords and other characters aprt from above legal characters"+"\n");
		
	}
	
}

class CaseSensitiveIdentifiers{
	
	int Foo = 4;
	int foo = 5;
	
	public void getCaseSentitiveIdentifier(){
		
		System.out.println("Case Sensitive Identifiers: " + "\n" + "Foo:" + Foo + "\n" + "foo:" + foo);
		
	}
}


