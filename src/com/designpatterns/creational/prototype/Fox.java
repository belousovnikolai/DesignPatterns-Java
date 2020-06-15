package com.designpatterns.creational.prototype;

public class Fox extends Animal {

    public boolean isQuick;

    public Fox() {
    }

    public Fox(Fox fox) {
        super(fox);
        if (fox != null) {
            this.isQuick = fox.isQuick;
        }
    }

    @Override
    public Animal clone() {
        return new Fox(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fox)) return false;
        if (!super.equals(o)) return false;
        Fox fox = (Fox) o;
        return isQuick == fox.isQuick;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "isQuick=" + isQuick +
                ", legs=" + legs +
                ", ears=" + ears +
                ", color='" + color + '\'' +
                '}';
    }
}
