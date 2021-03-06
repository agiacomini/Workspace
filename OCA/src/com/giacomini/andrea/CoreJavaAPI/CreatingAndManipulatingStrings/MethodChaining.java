package com.giacomini.andrea.CoreJavaAPI.CreatingAndManipulatingStrings;

/*
 * N.B: E' molto comune chiamare metodi multipli sulla stessa String.
 * 		E' molto comune vedere codice che usa una tecnica chiamata "Method Chaining" per stipare il più codice
 * 		possibile in uno spazio piccolo.
 */

public class MethodChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Di seguito un'esempio dove vengono chiamati in serie più metodi di String, i quali ogni volta ritornano un valore
		 * che viene messo in una nuova String. In questo caso ci sono quattro valori String.
		 */
		String start = "AniMal   ";
		String trimmed = start.trim();											// "AniMal"
		String lowercase = trimmed.toLowerCase();								// "animal"
		String result = lowercase.replace('a', 'A');							// "Animal"
		
		System.out.println(result);
		
		/*
		 * Di seguito invece una versione più compatta (ma anche equivalente) delle sequenza di chiamate fatte prima.
		 */
		String result2 = "AniMal    ".trim().toLowerCase().replace('a', 'A');	// "Animal"
		System.out.println(result2);
		
		/*
		 * Di seguito un'altro esempio per dimostrare che le String sono immutabili.
		 * la variabile "b" prima punta alla String "ABC", poi dopo aver applicato una serie di altri metodi punta
		 * ad una nuova String "A23". Questo per dire che lo statement "b = b.replace("B","2").replace('C', '3');"
		 * fa semplicemente cambiare puntamento alla variabile "b" e NON fa cambiare invece lo stato della String.
		 */
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B","2").replace('C', '3');
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
