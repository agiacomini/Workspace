package com.giacomini.andrea.CoreJavaAPI.UderstandingJavaArray;

/*
 * N.B: La classe "Arrays" (java.util.Arrays) ha una serie di metodi di ordinamento in grado di ordinare array
 * 		che collezionano qualsiasi tipo di oggetto/primitiva.
 */

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * N.B: In questo caso, visto che si tratta di un array di primitive "int" l'ordinamento è numerico.
		 */
		int[] numbers = {6, 9, 1};
		Arrays.sort(numbers);
		for(int i = 0 ; i < numbers.length ; i++){
			System.out.println(numbers[i] + " ");
		}
		
		System.out.println();
		
		/*
		 * N.B: In questo caso, visto che si tratta di un array di String l'ordinamento è alfabetico.
		 */
		String[] strings = {"10", "9", "100"};
		Arrays.sort(strings);
//		for(int i = 0 ; i < strings.length ; i++){
//			System.out.println(strings[i] + " ");
//		}
		for(String string : strings){
			System.out.println(string + " ");
		}

	}

}
