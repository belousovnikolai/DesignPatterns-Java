package com.designpatterns.creational.builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Builder constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);

        return builder;
    }

    public Builder constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new SuvEngine());
        builder.setTripComputer(true);

        return builder;
    }
}
