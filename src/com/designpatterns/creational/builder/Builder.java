package com.designpatterns.creational.builder;

// The builder interface specifies methods for creating the
// different parts of the product objects.
public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void setTripComputer(boolean choice);
    void setGPS(boolean choice);
}
