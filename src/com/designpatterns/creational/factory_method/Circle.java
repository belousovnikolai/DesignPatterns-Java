package com.designpatterns.creational.factory_method;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}
