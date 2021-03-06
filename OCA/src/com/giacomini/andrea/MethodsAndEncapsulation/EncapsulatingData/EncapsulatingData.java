package com.giacomini.andrea.MethodsAndEncapsulation.EncapsulatingData;

/*
 * N.B: Come si è visto nel capitolo "BuildingBlocks" è possibile avere variabili d'istanza senza nessun modificatore d'accesso
 * 		specificato, il che implica che verrà considerato il modificatore di accesso di Default (private + package), il quale
 * 		permette a quasiasi classe nello stesso package di settare la variabile.
 * 		Questa situazione però non ci permetterebbe di avere controllo sulla variabile, perché niente ci potrebbe garantire che 
 * 		qualcuno setti per esempio ad un valore negativo (-1) la variabile. Questa naturalmente è una situazione che non è 
 * 		per niente ideale.
 * 		L'incapsulamento ci salva proprio da questa situazione.
 * 
 * 		L'incapsulamento permette di settare le variabili d'istanza solo ai metodi della classe stessa in cui le variabili sono 
 * 		dichiarate.
 * 		Il chimante userà solo questi metodi (setter e getter) per settare le variabili d'istanza e per farsi restituire il valore
 * 		della stessa.
 * 
 * 		Nell'incapsulamento le variabili d'istanza sono sempre PRIVATE mentre i metodi getter e setter sono PUBLIC.
 * 		
 * 		Naming Convention (JavaBean): 
 * 
 * 			- variabili boolean 		-> private boollean happy
 * 								   	   	   public boolean isHappy(){ return happy; }
 * 								           public void setHappy(boolean){ this.happy = happy; }
 * 
 * 			- variabili NON booleane 	-> private int numberEggs
 * 										   public int getNumberEggs(){ return numberEggs; }
 * 										   pubnlic void setNumbereggs(int numberEggs){ this.numberEggs = numberEggs; }
 * 
 */

public class EncapsulatingData {

	// Default Access - ogni classe nel medesimo package potrà settare la variabile "numberEggs".
	int numberEggs;
	
	// PRIVATE - è permesso solo al codice della classe di accedere alla variabile e di eventualmente settare il valore della var;
	private int numberEggs2;
	
	private boolean playing;
	private String name;
	
	// Permettere di accedere/legger il valore della variabile; 
	public int getNumberEggs2(){
		return numberEggs2;
	}
	
	// Permetter di settare il valore della variabile e controllare che non sia possibile settare un valore negativo;
	public void setNumberEggs2(int numberEggs2){
		if(numberEggs2 >= 0)
			this.numberEggs2 = numberEggs2;
	}
	
	// Il metodo è corretto MA non segue la naming convention dei JavaBean. Il nome corretto del metodo dovrebbe essere il secondo;
	public boolean getPlaying(){ return playing; }
	public boolean isPlaying(){ return playing; }
	
	// Il metodo è corretto MA non segue la naming convention dei JavaBean. Il nome del metodo dovrebbe iniziare con "get";
	public String name(){ return name; }
	public void updateName(String n){ name = n; }
	public void setName(String n){ name = n; }

}
