package com.designpatterns.creational.abstract_factory;

// TV class
public class SonyTV implements TV {
    @Override
    public void watch() {
        System.out.println("Watching 'Sony' TV...");
    }
}
