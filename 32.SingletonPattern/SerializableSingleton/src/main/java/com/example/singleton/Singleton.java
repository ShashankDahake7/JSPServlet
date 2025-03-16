package com.example.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final Singleton instance = new Singleton(); // Eager Initialization

    private Singleton() {} // Private constructor to prevent instantiation

    public static Singleton getInstance() {
        return instance;
    }

    protected Object readResolve() { // Ensures the same instance after deserialization
        return instance;
    }

    public String doSomething() {
        return "Serializable Singleton instance method called.";
    }
}
