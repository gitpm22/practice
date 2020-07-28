package com.prm.java.practice.oopconcepts.inheritance;

import com.prm.java.practice.oopconcepts.inheritance.*;

public class TestAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Can not instantiate objects of abstract class Bike and Car
		
		//Bike bike = new Bike();
		//Car car = new Car();
		
		MarutiAutomatic mAuto = new MarutiAutomatic();
		
		MarutiManual mManual = new MarutiManual();
		
		mAuto.start();
		mAuto.stop();
		mAuto.accelerate();
		
		System.out.println("\n -------------------------- \n");
		
		mManual.start();
		mManual.stop();
		mManual.accelerate();

	}

}
