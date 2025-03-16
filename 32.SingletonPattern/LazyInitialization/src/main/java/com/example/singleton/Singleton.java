package com.example.singleton;

public class Singleton {
    private static volatile Singleton instance; // Volatile for thread safety

    private Singleton() {} // Private constructor to prevent instantiation

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // Thread-safe block
                if (instance == null) {
                    instance = new Singleton(); // Lazy initialization
                }
            }
        }
        return instance;
    }

    public String doSomething() {
        return "Thread-safe Singleton instance method called.";
    }
}
