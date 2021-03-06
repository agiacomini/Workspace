package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples;

public class Kangaroo extends Marsupial {

	// Hiding Method
//	public static boolean isBiped(){
//		return true;
//	}
	
	// Overiding
	public boolean isBiped(){
		return true;
	}
	
	// Overiding Method
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kangaroo joey = new Kangaroo();
		
		joey.getMarsupialDescription();									// Marsupial walks on two legs: true
		joey.getKangarooDescription();									// Kangaroo hops on two legs: true
		
		// Riferimento diretto alla super-class (parent-class)
		Marsupial she = new Marsupial();
		she.getMarsupialDescription();

	}

}
