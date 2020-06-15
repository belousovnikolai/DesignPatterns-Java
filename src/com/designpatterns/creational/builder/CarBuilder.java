package com.designpatterns.creational.builder;

public class CarBuilder implements Builder {

    private Car car;

    // A fresh builder instance should contain a blank product
    // object which it uses in further assembly.
    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        // Set the number of seats in the car.
    }

    @Override
    public void setEngine(Engine engine) {
        // Install a given engine.
    }

    @Override
    public void setTripComputer(boolean choice) {
        // Install a trip computer.
    }

    @Override
    public void setGPS(boolean choice) {
        // Install a global positioning system.
    }

    // After returning the end result to the client, call the reset method at the end of the
    // `getProduct` method body. This behavior isn't mandatory, and you can make your builder wait for an
    // explicit reset call from the client code before disposing of the previous result.
    public Car getProduct() {
        Car c = this.car;
        this.reset();
        return c;
    }
}
