package com.designpatterns.factory_method;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new PolygonFactory();

        Shape shape1 = shapeFactory.createShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.createShape("octagon");
        shape2.draw();

        Shape shape3 = shapeFactory.createShape("square");
        shape3.draw();
    }
}
