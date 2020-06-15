package com.designpatterns.creational.abstract_factory;

// Abstract factory with a set of various products creation methods
public interface ProductFactory {
    Headphones createHeadphones();
    Player createPlayer();
    TV createTV();
}
