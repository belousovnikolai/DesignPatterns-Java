package com.designpatterns.singleton;

public class Singleton {
    private static Singleton singleton;
    public String foo;

    private Singleton(String foo) {
        this.foo = foo;
    }

    public static Singleton getInstance(String foo) {
        if (singleton == null) {
            singleton = new Singleton(foo);
        }
        return singleton;
    }
}
