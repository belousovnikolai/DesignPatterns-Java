package com.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class BundledAnimalCache {
    private Map<String, Animal> cache = new HashMap<>();

    public BundledAnimalCache() {
        Fox fox = new Fox();
        fox.legs = 4;
        fox.ears = 2;
        fox.color= "brown";
        fox.isQuick = true;

        Dog dog = new Dog();
        dog.legs = 4;
        dog.ears = 2;
        dog.color = "transparent";
        dog.isLazy = true;

        cache.put("Quick brown fox", fox);
        cache.put("Lazy transparent dog", dog);
    }

    public Animal put(String key, Animal animal) {
        cache.put(key, animal);
        return animal;
    }

    public Animal get(String key) {
        return cache.get(key).clone();
    }
}
