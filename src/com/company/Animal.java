package com.company;


import java.io.File;

public class Animal {
     final public String species;
     public Double weight;
     public String name;
     public File pic;

    public Animal(String species) {
        this.species = species;
    }


    void feed(){
        weight +=1;
        System.out.println("Thx for food");
    }
}
