package com.giacomini.andrea.EserciziSupplementari.Modulo3;

public class CambiaRisultato {

	public void cambiaRisultato(Risultato risultato){
		
		risultato.risultato += 3.2F;
	}
	
	public float cambiaRisultato(float risultato){
		
		risultato += 1;
		return risultato;
	}
}