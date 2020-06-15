package com.designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {

        BundledAnimalCache cache = new BundledAnimalCache();

        Animal animal1 = cache.get("Quick brown fox");
        Animal animal2= cache.get("Lazy transparent dog");
        Animal animal3= cache.get("Lazy transparent dog");

        if (animal1 != animal2 && !animal1.equals(animal2)) {
            System.out.println("Quick brown fox != Lazy transparent dog (yay!)");
        } else {
            System.out.println("Quick brown fox == Lazy transparent dog (booo!)");
        }

        if (animal2 != animal3) {
            System.out.println("Lazy transparent dogs are different objects (yay!)");
            if (animal2.equals(animal3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booooo!)");
            }
        } else {
            System.out.println("Animal objects are the same (booooo!)");
        }
    }
}
