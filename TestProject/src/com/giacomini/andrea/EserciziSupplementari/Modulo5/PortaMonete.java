package com.giacomini.andrea.EserciziSupplementari.Modulo5;

public class PortaMonete {

	private final Moneta[] monete = new Moneta[10];
	
	// Costruttore;
	public PortaMonete(int... valori){
		int numeroMonete = valori.length;
		for(int i = 0 ; i < numeroMonete ; i++){
			if(i >= 10){
				System.out.println("Sono state inserite solo le prime 10 monete!");
				break;
			}
			monete[i] = new Moneta(valori[i]);
		}
	}
	
	public static void main(String[] args){
		int[] valori = new int[args.length];

		for(int i = 0 ; i < args.length ; i++){
			
			valori[i] = Integer.parseInt(args[i]);
		}

		PortaMonete portaMonete = new PortaMonete(valori);
	}
	
	public void aggiungi(Moneta moneta){
		
		System.out.println("Proviamo ad aggiungere una nuova moneta!");
		
		int indiceLibero = primoIndiceLibero();
		if (indiceLibero == -1){
			System.out.println("Portamonete pieno! La nuova moneta non è stata aggiunta");
		} else {
			monete[indiceLibero] = moneta;
			System.out.println("E' stata aggiunta una nuova moneta!");
		}
	}
	
	private int primoIndiceLibero(){
		int indice = -1;
		
		for(int i = 0 ; i < 10 ; i++){
			if(monete[i] == null){
				indice = i;
				break;
			}
		}
		
		return indice;
		
	}
	
	public void stato(){
		for (int i = 0 ; i < monete.length ; i++){
			System.out.println(monete[i].getValore());
		}
	}
	
	public void preleva(Moneta moneta){
		
		for (int i = 0 ; i < monete.length ; i++) {
			
			if(monete[i].getValore() == moneta.getValore()){
				System.out.println("Sto prelevando la moneta di valore: " + moneta.getValore());
				monete[i] = null;
			} 
			
		}
	}
}
