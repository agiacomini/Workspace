package com.giacomini.andrea.OCP.AdvancedClassDesign.CreatingNestedClasses.Test;

// N.B: Vanno bene entrambi i tipi di import;
import com.giacomini.andrea.OCP.AdvancedClassDesign.CreatingNestedClasses.Test2.Toucan.Beak;
//import static com.giacomini.andrea.OCP.AdvancedClassDesign.CreatingNestedClasses.Test2.Toucan.Beak;

public class TestNestedStaticClass {

	// Classe innestata STATIC;
	static class Nested{
		
		// Campi d'istanza della class innestata STATIC;
		private String string = "String filed in Inner Static class";
		private int i = 6;
		
		// Campi di classe (STATIC) della classe innestata STATIC;
		private static String string2 = "Static string field in Inner Static class";
	}
	
	public static void main(String[] args){
		
		// N.B: La classe più esterna (outer) può accedere ai campi STATIC della classe innestata STATIC, anche se sono PRIVATE,  
		//		senza un'istanza della stessa;
		System.out.println("string2: " + Nested.string2);
		
		System.out.println();
		
		Nested nested = new Nested();
		System.out.println("string: " + nested.string + ", i: " + nested.i + ", string2: " + nested.string2);
		
		System.out.println();
		
		System.out.println(Beak.string);
	}
}
