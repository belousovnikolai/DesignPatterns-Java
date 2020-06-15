package com.designpatterns.creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        // Produce sony factory
        ProductFactory sonyFactory = FactoryProducer.getFactory("sony");

        // Create product objects with sony factory and operate them
        Headphones sonyHeadphones = sonyFactory.createHeadphones();
        sonyHeadphones.listen();

        TV sonyTV = sonyFactory.createTV();
        sonyTV.watch();

        Player sonyPlayer = sonyFactory.createPlayer();
        sonyPlayer.play();

        // Produce xiaomi factory
        ProductFactory xiaomiFactory = FactoryProducer.getFactory("xiaomi");

        // Create product objects with xiaomi factory and operate them
        Headphones xiaomiHeadphones = xiaomiFactory.createHeadphones();
        xiaomiHeadphones.listen();

        TV xiaomiTV = xiaomiFactory.createTV();
        xiaomiTV.watch();

        Player xiaomiPlayer = xiaomiFactory.createPlayer();
        xiaomiPlayer.play();
    }
}
