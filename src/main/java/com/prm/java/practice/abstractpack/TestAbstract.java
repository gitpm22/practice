package com.prm.java.practice.abstractpack;

public class TestAbstract {

	public static void main(String[] args) {
		TeslaCar teslaCar = new TeslaCar();
		MarutiCar marutiCar = new MarutiCar();
		
		teslaCar.start();
		marutiCar.start();
		
		teslaCar.accelerate();
		marutiCar.accelerate();
		
		teslaCar.stop();
		marutiCar.stop();
		

	}

}
