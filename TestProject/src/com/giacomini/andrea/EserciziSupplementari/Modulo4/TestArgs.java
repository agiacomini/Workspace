package com.giacomini.andrea.EserciziSupplementari.Modulo4;

public class TestArgs {

	public static void main(String[] args){
		
		if (args.length >= 1){
		
			System.out.println(args[0]);
		} else 
			System.out.println("L'array args è vuoto");
		
	}
}
