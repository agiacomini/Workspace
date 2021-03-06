package com.giacomini.andrea.AdvancedClassDesign.WorkingWithEnums;

import com.giacomini.andrea.AdvancedClassDesign.WorkingWithEnums.Test.Season;
import com.giacomini.andrea.AdvancedClassDesign.WorkingWithEnums.Test.Season2;

/*
 * N.B: Vediamo nell'esempio "UsingEnumsInSwitchStatements" come usare gli enum all'interno di uno "switch" statement e come
 *    	aggiungere extra funzionalità. Il codie stampa "Time for the pool!" dal momento che c'è un match con SUMMER.
 *    	Si noti che (nei diversi case) si è semplicemente scritto il valore dell'enum piuttosto che Season.WINTER. La ragione è che Java
 *    	già conosce che i soli possibili match possono essere valori enum. Java tratta il tipo enum come implicito.
 *    	Infatti, se si scriveva Season.WINTER il codice non compilava. E' importante fissarsi in mente che enum non è
 *    	un tipo int. Il seguente codice non compila:
 *    
 *      	switch(summer){
 *      
 *      		case 0: // NON COMPILA
 *      				System.out.println("Get out the sled!");
 *      				break;
 *      	}
 *   	 
 *    	Non è possibile confrontare un int con un tipo enum. Prestare particolare attenzione quando si lavora con gli enum
 *    	che vengano usati solo come enum.
 */

public class UsingEnumsInSwitchStatements {

	public static void main(String[] args){
		
		Season season = Season.SUMMER;
		switch(season){
		
			case WINTER: System.out.println("Get out the sled!");
						 break;
						 
			case SUMMER: System.out.println("Time for the pool!");
						 break;
						 
//			case Season.SPRING:									// NON CMPILA 
						 
			default: System.out.println("It is summer yet?");
			
//			case 0: System.out.println("Get out the sled!");	// NON COMPILA
//					break;
		}
		
		System.out.println();
		
		Season2.SUMMER.printExpectedVisitors();					// High
	}
}
