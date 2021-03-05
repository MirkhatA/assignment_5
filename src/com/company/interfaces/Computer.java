package com.company.interfaces;

public interface Computer {
    void turnOn();
    default void turnOff() {
        System.out.println("The pc is turned off");
    }
}
