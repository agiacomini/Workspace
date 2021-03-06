package com.giacomini.andrea.DesignPatternsAndPrinciples.DesigningAnInterface.Test;

public interface Fly {

    public int getWingSpan() throws Exception;

    // Variabile costante;
    public static final int MAX_SPEED = 100;

    // Metodo di "default";
    public default void land(){

        System.out.println("Animal is landing");
    }

    // Metodo STATIC;
    public static double calculateSpeed(float distance, double time){

        return distance / time;
    }
}
