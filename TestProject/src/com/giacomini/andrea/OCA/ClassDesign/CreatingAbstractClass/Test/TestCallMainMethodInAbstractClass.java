package com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Test;

public abstract class TestCallMainMethodInAbstractClass {

	public abstract void calcuate();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("calculating");
		
		TestCallMainMethodInAbstractClass c = null;
		c.calcuate();

	}

}
