package com.giacomini.andrea.EserciziSupplementari.Modulo3;

public class TestRisultatoFloat {

	public static void main(String[] args){
		
		float risultato = 5F;
		
		System.out.println(risultato);
		
		CambiaRisultato cr = new CambiaRisultato();
		risultato = cr.cambiaRisultato(risultato);
		
		System.out.println(risultato);
	}
}