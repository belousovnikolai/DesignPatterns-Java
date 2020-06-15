package com.designpatterns.creational.factory_method;

public class PolygonFactory implements ShapeFactory {
    @Override
    public Shape createShape(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("octagon")) {
            return new Octagon();
        } else {
            throw new RuntimeException(shape + " is not a valid name");
        }
    }
}
