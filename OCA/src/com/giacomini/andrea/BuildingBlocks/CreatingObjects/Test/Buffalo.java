package com.giacomini.andrea.BuildingBlocks.CreatingObjects.Test;

class Animal {
	
	public String species;
	
	public Animal(int age){
		
		this();
		System.out.println("1");
//		this();		ERRORE DI COMPIALZIONE - this e super vanno SEMPRE messi come primo statement del costruttore;
	}
	
	public Animal(){
		
		System.out.println("2");
	}
}

public class Buffalo extends Animal {

	public Buffalo(){
		
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buffalo buffalo = new Buffalo(); 

	}
	
	public void methodBuffalo(){
		
//		this();		NON COMPILA - non è possibile richiamare un costruttore con "this()" o "super()" all'interno di un metodo.	
//								  Entrambi posso comparire solo all'interno di un altro costruttore;
		System.out.println("ciao");
		this.species = "mammifero";
		
	}

}
