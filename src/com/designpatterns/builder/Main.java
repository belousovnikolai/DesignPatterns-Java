package com.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        // The final product is often retrieved from a builder
        // object since the director isn't aware of and not
        // dependent on concrete builders and products.
        Car car = builder.getProduct();

        CarManualBuilder cmBuilder = new CarManualBuilder();
        director.constructSUV(cmBuilder);
        Manual manual = cmBuilder.getProduct();
    }
}
