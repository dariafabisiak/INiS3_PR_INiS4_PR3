package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Maxik";
        dog.weight = 8.0;
        dog.feed();


        Phone iPhone = new Phone("Apple","XS", 4.5, "ios");


        Human me = new Human();
        me.firstName = "Daria";
        me.lastName = "Fabisiak";
        me.pet = dog;

        System.out.println("Zwierzak nazywa się: " + me.pet.name);
    }
}
