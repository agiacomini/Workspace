package com.giacomini.andrea.DesignPatternsAndPrinciples.DesigningAnInterface.Test;

public class Eagle implements Fly {

    // Implementa il metodo "getWingSpan()" ereditato del'interfaccia "Fly";
    public int getWingSpan(){
        return 15;
    }

    // Esegue l'ovveride del metodo di "default" ereditato dall'interfaccia "Fly";
    public void land(){

        System.out.println("Eagle is diving fast");
    }

    public static void main(String[] args){

        // Usa la variabile costante ereditata dall'interfaccia "Fly";
        System.out.println(MAX_SPEED);
        System.out.println(Fly.MAX_SPEED);

        System.out.println("Spped: " + Fly.calculateSpeed(2.3f,1.2));
    }
}
