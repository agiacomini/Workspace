package com.giacomini.andrea.CoreJavaAPI.UderstandingJavaArray;

public class UsingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] animals = {"monkey", "chimp", "donkey"};
		System.out.println(animals.length);					// 3
		System.out.println(animals[0]);						// monkey
		System.out.println(animals[1]);						// chimp
		System.out.println(animals[2]);						// donkey
		
		String[] birds = new String[6];
		/*
		 * N.B: Il metodo "length()" non considera il contenuto dell'array MA solo quanti slot ci sono nell'array per contenre
		 * 		gli elementi.
		 */
		System.out.println(birds.length);					// 6
		
		/*
		 * N.B: E' molto comune usare un ciclo (loop) per leggere o scrivere gli elementi di un'array.
		 * 		In questo caso il ciclo setta gli elementi dell'array ad un valore calcolato come la somma dell'indice + 5.
		 */
		int[] numbers = new int[10];
		for (int i = 0 ; i < numbers.length ; i++){
			numbers[i] = i + 5;
		}
		
		/*
		 * N.B: Errori comuni sugli indici di un'array. 
		 */
//		numbers[10] = 3;									// Throw ArrayIndexOutOfBoundException
//		numbers[numbers.length] = 5;						// Throw ArrayIndexOutOfBoundException
		
//		for (int i = 0 ; i <= numbers.length ; i++){		// Throw ArrayIndexOutOfBoundException (<= E' SBAGLIATO)
//			numbers[i] = i + 5;
//		}

	}

}
