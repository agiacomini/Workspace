package com.giacomini.andrea.ClassDesign.ImplementingInterfaces.Examples;

public interface SharkFamily extends HasFins {

	// Viene fatto l'overiding del metodo getNumberOfFins() già implementato nell'interfaccia da cui si sta ereditando
	public default int getNumberOfFins(){
		return 8;
	}
	
	public double getLongestFinLength();
		
	
//	public boolean doFinsHaveScales(){						NON COMPILA - si sta facendo l'overiding del metodo, fornendo una nuova
//		return true;													  implenetazione al metodo, ma purtroppo il metodo non viene 
//	}																	  marcato come default e quindi errore di compilazione;
}
