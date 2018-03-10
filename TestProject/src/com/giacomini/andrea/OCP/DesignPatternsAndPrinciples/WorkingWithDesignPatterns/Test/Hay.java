package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test;

public class Hay extends Food {

    public Hay(int quantity){

        super(quantity);
    }

    public void consumed(){

        System.out.println("Hay eaten: " + getQuantity());
    }
}
