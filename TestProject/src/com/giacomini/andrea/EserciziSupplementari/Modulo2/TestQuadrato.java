package com.giacomini.andrea.EserciziSupplementari.Modulo2;

public class TestQuadrato {

	public static void main(String[] args){
		
		Quadrato quadrato = new Quadrato(5);
		
//		quadrato.lato = 5;
		
		// Stampa il perimetro del quadrato;
		System.out.println("Il perimetro del quadrato: " + quadrato.perimetro());
		
		// Stampa l'area del quadrato;
		System.out.println("L'area del quadrato: " + quadrato.area());
	}
}