package com.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("CHECK");
        Singleton singleton1 = Singleton.getInstance("OUT");

        // Printed values will be the same as only one Singleton was created
        System.out.println(singleton.foo);
        System.out.println(singleton1.foo);
    }
}
