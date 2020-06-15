package com.designpatterns.creational.abstract_factory;

// Factory producer, returns factory of a given brand
public class FactoryProducer {
    public static ProductFactory getFactory(String brand) {
        if (brand.equalsIgnoreCase("xiaomi")) {
            return new XiaomiFactory();
        } else if (brand.equalsIgnoreCase("sony")) {
            return new SonyFactory();
        } else {
            throw new RuntimeException(brand + " is not a valid brand name");
        }
    }
}
