package com.giacomini.andrea.OCA.Exceptions.CallingMethodsThatThrowExceptions.Examples;

//class CanNotHopException extends Exception {}

class Hopper {
	
	public void hop() {};
}

public class Bunny3 extends Hopper {

	// Overriding del metodo "hop()" ereditato dalla super-classe "Hopper"
//	public void hop() throws CanNotHopException {							NON COMPILA - non è permesso aggiungere nuove 
//																						  eccezioni all'overriding di un metodo
//	}																					  che non ne dichiara nessuna;			
}
