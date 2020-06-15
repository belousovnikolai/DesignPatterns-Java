package com.designpatterns.creational.prototype;

import java.util.Objects;

public abstract class Animal {

    public int legs;
    public int ears;
    public String color;

    public Animal() {
    }

    public Animal(Animal animal) {
        if (animal != null) {
            this.legs = animal.legs;
            this.color = animal.color;
            this.ears = animal.ears;
        }
    }

    public abstract Animal clone();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return animal.legs ==legs && animal.ears == ears && Objects.equals(color, animal.color);
    }
}
