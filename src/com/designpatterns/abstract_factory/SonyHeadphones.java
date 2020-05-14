package com.designpatterns.abstract_factory;

// Headphones class
public class SonyHeadphones implements Headphones {
    @Override
    public void listen() {
        System.out.println("Listening 'Sony' headphones...");
    }
}
