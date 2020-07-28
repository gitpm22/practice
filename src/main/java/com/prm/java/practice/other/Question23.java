package com.prm.java.practice.other;



interface Data{
	
	public void load();
}

abstract class Info {
	
	public abstract void load();
	
}

public class Question23 extends Info implements Data{

	public void load() {}
}

//public class Question23 extends Info implements Data{
//	
//	public void Data.load() {}
//	
// 	public void Info.load(){}
 