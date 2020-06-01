package com.designpatterns.prototype;

public class Dog extends Animal {

    public boolean isLazy;

    public Dog() {
    }

    public Dog(Dog dog) {
        super(dog);
        if (dog != null) {
            this.isLazy = dog.isLazy;
        }
    }

    @Override
    public Animal clone() {
        return new Dog(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return isLazy == dog.isLazy;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isLazy=" + isLazy +
                ", legs=" + legs +
                ", ears=" + ears +
                ", color='" + color + '\'' +
                '}';
    }
}
