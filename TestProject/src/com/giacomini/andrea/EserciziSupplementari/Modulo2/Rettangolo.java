package com.giacomini.andrea.EserciziSupplementari.Modulo2;

public class Rettangolo {

	public int base;
	public int altezza;
	
	public final int NUMERO_LATI_UGUALI = 2;
	
	public Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	public int perimetro(){
		
		int perimetro = (base + altezza) * NUMERO_LATI_UGUALI;
		return perimetro;
	}
	
	public int area(){
		int area = base * altezza;
		return area;
	}
	
	
}