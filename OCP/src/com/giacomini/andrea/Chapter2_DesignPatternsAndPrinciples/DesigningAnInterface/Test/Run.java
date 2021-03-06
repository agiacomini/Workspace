package com.giacomini.andrea.DesignPatternsAndPrinciples.DesigningAnInterface.Test;

public interface Run extends Walk {

    // Metodo public abstract;
    public abstract boolean canHuntWhileRunning();

    // Ovveride del metodo public abstract ereditato dall'interfaccia padre "Walk";
    abstract double getMaxSpeed();
}
