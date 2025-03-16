package com.example.singleton;

public class Singleton {
    private static final Singleton instance = new Singleton(); // Eager instantiation

    private Singleton() {} // Private constructor to prevent instantiation

    public static Singleton getInstance() {
        return instance;
    }

    public String doSomething() {
        return "Singleton instance method called.";
    }
}
