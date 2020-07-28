package com.prm.java.practice.abstractpack;

/*Rule for Abstract Classes:
 * 1. They cannot be instantiated
 * 2. They can have partial/full or no implementation
 * 
 * */

public abstract class AbstractFourwheeler implements Automobile {
	
	public void start() {
		System.out.println("Fourwheeler starts with a key");		
	}
	
	public void stop() {
		System.out.println("Stop by turning off the engine");
	}

}
