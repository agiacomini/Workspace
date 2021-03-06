package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test;

import java.util.*;

public class AnimalBuilder {

    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age){

        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species){

        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods){

        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public AnimalImmutable build(){

        return new AnimalImmutable(species, age, favoriteFoods);
    }
}
