package com.giacomini.andrea.OperatorsAndStatements.UnderstandingAdvancedFlowControl;

/*
 * N.B: I cicli possono contenere anche altri cicli.
 */

public class LoopsAnnidati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Esempio di cicli annidati: in questo caso abbiamo mischiato un ciclo for enached (for-each) e un ciclo for (base).
		 * Il ciclo più esterno viene eseguito 3 volte. Ad ogni singola iterazione del ciclo (for-each) esterno, viene 
		 * eseguito 4 volte il ciclo for (base) più interno.
		 */
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for (int[] mySimpleArray : myComplexArray){
			for(int i = 0 ; i < mySimpleArray.length ; i++){
				System.out.println(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}
		
		/*
		 * Esempio di cicli annidati: in questo caso viene data dimostrazione di come annidare due cicli, uno "while" e l'altro
		 * "do-while". Alla prima iterazione del ciclo più esterno, il ciclo più interno invece viene iterato fino a quando
		 * il valore di x è 4, e cioè fino a quando non rispetta più la condizione (x > 5). A quel punto "x" viene decrementato
		 * di una unità e diventa 3. Viene stampato a video e poi passa di nuovo l'esecuzione del programma alla seconda
		 * iterazione del ciclo "while" più esterno. Alla seconda iterazione del ciclo più esterno, il ciclo più interno
		 * viene eseguito una sola volta, portando il valore di "x" a 1. Fuori dal ciclo più interno "x" viene ulteriormente
		 * decrementato per poi stampare a video 0. 
		 */
		int x = 20;
		while(x > 0){
			
			do{
				x -= 2;
						
			} while(x > 5);
			
			x--;
			System.out.println(x + "\t");
		}

	}

}
