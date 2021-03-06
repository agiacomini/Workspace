package com.giacomini.andrea.AdvancedClassDesign.WorkingWithEnums.Test;

public enum Season2 {

	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	
	// Variabile d'istanza;
	private String expectedVisitors;
	
	// Costruttore. E' privato perché può essere richiamato solo all'interno dell'enum;
	private Season2(String expectedVistors){
		this.expectedVisitors = expectedVistors;
	}
	
	//	public Season2(String expectedVisitors){		NON COMPILA - i costruttori nell'enum devono necessariamente essere "private"; 
	//		
	//	}
	
	// Metodo;
	public void printExpectedVisitors(){
		System.out.println(expectedVisitors);
	}
}
