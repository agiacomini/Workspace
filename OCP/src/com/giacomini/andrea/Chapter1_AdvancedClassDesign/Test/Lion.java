package com.giacomini.andrea.AdvancedClassDesign.Test;

public class Lion extends Cat{

	// Overriding del metodo padre "clean()";
//	public void clean(){}
	
	// Overriding del metodo padre "clean()" ma con l'aggiunta della parola chiave FINAL si previene che venga a sua volta ovverriden
	// da una possibile sotto-classe;
	public final void clean(){}
	
//	public void test(){}	ERRORE DI COMPILAZIONE - un metodo STATIC della classe padre non può essere overriding, può
//													 essere solo hidding;
}
