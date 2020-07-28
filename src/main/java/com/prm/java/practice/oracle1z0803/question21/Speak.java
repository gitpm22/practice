package com.prm.java.practice.oracle1z0803.question21;

public class Speak {

	public static void main(String[] args) {
		
		
		Speak speakIt = new Tell(); // parent reference pointing to child's object
		
		Tell tellIt = new Tell();
		
		//speakIt.tellItLikeItIs();
		//(Truth)speakIt.tellItLikeItIs(); // ask interpretation of this to Abhi

		((Truth)speakIt).tellItLikeItIs(); // ask interpretation of this to Abhi
		
		tellIt.tellItLikeItIs();
		//(Truth)tellIt.tellItLikeItIs(); // ask interpretation of this to Abhi
		((Truth)tellIt).tellItLikeItIs(); // ask interpretation of this to Abhi
		

	}

}

class Tell extends Speak implements Truth{
	
	public void tellItLikeItIs() {
			System.out.println("Right on!");
	}
	
	
}

interface Truth{
	
	public void tellItLikeItIs();
}