package com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples;

public class Fish {

	public static void main(String[] args){
		Fish fish = new Fish();
//		Bird bird = (Bird)fish;						NON COMPILA- il cast non è possibile perché le due classi "Bird" e "Fish"
//																 non sono relazionate tra di loro attraverso nessuna gerarchia
//																 di classe;
	}
}
