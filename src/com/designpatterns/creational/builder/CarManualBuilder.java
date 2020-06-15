package com.designpatterns.creational.builder;

public class CarManualBuilder implements Builder {

    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    // A fresh builder instance should contain a blank product
    // object which it uses in further assembly.
    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        // Document car seat features.
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
    public Manual getProduct() {
        Manual m = this.manual;
        this.reset();
        return m;
    }
}
