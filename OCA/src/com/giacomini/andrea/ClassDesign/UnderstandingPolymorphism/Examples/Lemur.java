package com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples;

public class Lemur extends Primate implements HasTail {

	// implementa il metodo "isTailStriped()" ereditato dall'interfaccia "HasTail";
	public boolean isTailStriped(){
		return false;
	}
	
	// variabile d'istanza
	public int age = 10;
	
	public static void main(String[] args){
		
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);						// 10
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());		// false
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());				// true
		
		
//		System.out.println(hasTail.age);					NON COMPILA - il riferimento "hasTail" ha accesso diretto solo ai metodi
//																		  definiti con l'interfaccia "HasTail", quindi non conosce
//																		  la variabile "age" come parte dell'oggetto.
//		System.out.println(primate.isTailStriped);			NON COMPILA - il riferimento "primate" ha accesso solo ai metodi definiti
//																		  nella classe "Primate", e non ha accesso diretto al metodo
//																		  "isTailStriped()";
		
	}
}
