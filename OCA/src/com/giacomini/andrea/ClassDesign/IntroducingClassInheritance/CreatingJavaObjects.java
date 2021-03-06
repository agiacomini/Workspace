package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance;

/*
 * N.B: In JAVA tutte le classi ereditano da una singola classe "java.lang.Object".
 *		Inoltre, "java.lang.Object" è l'unica classe che non ha nessuna classe parent.
 *		Quando non si specifica in modo esplicito una classe padre da cui ereditare, JAVA in modo automatico
 *		aggiunge alla definizione della nuova classe "extends java.lang.Object".
 *		
 *		Esempio: le due seguenti definizioni di classe sono equivalenti
 *	
 *			public class Zoo {}
 *
 * 			public class Zoo extends java.lang.Object {}
 * 
 * 		Se invece si specifica in modo esplicito che una determinata classe eredita da una classe padre, allora JAVA
 * 		non aggiungerà in modo automatico l'estensione "extends java.lang.Object", tuttavia però la nuova classe definita
 * 		erediterà comunque dalla classe "java.lang.Object".
 * 		Dal momento che tutte le classi ereditano dalla classe "java.lang.Object", estendere una classe esistente significa che
 * 		la classe figlia eredita dalla classe "java.lang.Object" per costruzione. Queesto significa che se si da uno sguardo
 * 		alla struttura gerarchica delle classi, questa finirà sempre con la classe "java.lang.Object" come la prima classe dell'albero. 
 * 				
 */

public class CreatingJavaObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
