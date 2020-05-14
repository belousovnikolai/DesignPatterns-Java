package com.designpatterns.abstract_factory;

// Factory class implementation
public class SonyFactory implements ProductFactory {
    @Override
    public Headphones createHeadphones() {
        return new SonyHeadphones();
    }

    @Override
    public Player createPlayer() {
        return new SonyPlayer();
    }

    @Override
    public TV createTV() {
        return new SonyTV();
    }
}
