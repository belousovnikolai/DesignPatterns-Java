package com.designpatterns.abstract_factory;

// Factory class implementation
public class XiaomiFactory implements ProductFactory {
    @Override
    public Headphones createHeadphones() {
        return new XiaomiHeadphones();
    }

    @Override
    public Player createPlayer() {
        return new XiaomiPlayer();
    }

    @Override
    public TV createTV() {
        return new XiaomiTV();
    }
}
