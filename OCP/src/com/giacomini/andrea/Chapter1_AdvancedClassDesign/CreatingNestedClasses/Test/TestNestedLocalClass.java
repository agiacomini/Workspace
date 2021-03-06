package com.giacomini.andrea.AdvancedClassDesign.CreatingNestedClasses.Test;

public class TestNestedLocalClass {

	public static void main(String[] args){
		
	}
}

class Outer {
	
	private int lenght = 5;
	
	public void calculate(){
		
		final int width = 20;
		
		// Classe inner Locale (dentro il metodo "calculate()");
		class Inner {
			
			public void multiply(){
				
				// N.B: nella classe inner locale è possibile accedere tranquillamente alla variabile d'istanza ("lenght") della
				//		classe più esterna MA in questo caso anche alla variabile locale ("width") del metodo "calculate()" in cui
				//		è innestata solo perché il campo è FINAL, altrimenti generalmente non sarebbe possibile;
				System.out.println(lenght * width);
			}
		}
		
		Inner inner = new Inner();
		inner.multiply();
	}	// N.B: qui finisce lo scope della classe inner locale, esattamente come lo scope delle variabili locali presenti
		//		nel metodo "calculate()";
	
	public static void main(String[] args){
		
		Outer outer = new Outer();
		outer.calculate();
	}
}
