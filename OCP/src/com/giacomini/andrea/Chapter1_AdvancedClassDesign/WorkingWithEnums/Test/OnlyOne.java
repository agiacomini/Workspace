package com.giacomini.andrea.AdvancedClassDesign.WorkingWithEnums.Test;

public enum OnlyOne {

	ONCE(true);
	   
	// Costruttore;
	private OnlyOne(boolean b){

		System.out.println("constructing");
	}
   
   	public static void main(String[] args){
  
   		OnlyOne firstCall = OnlyOne.ONCE;			// stampa "constructing";
		OnlyOne secondCall = OnlyOne.ONCE;			// non stampa più niente;
	}
}
