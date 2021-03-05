package com.company;

public class Laptop {
    private final int ram;
    private final float price;

    public Laptop(int ram, float price) {
        this.ram = ram;
        this.price = price;
    }

    public String isCheap() {
        return (price < 500) ? "It is kinda cheap" : "It is not so cheap";
    }

    public String isMemoryNeeded() {
        if (ram <= 6) {
            return "You should add ram";
        }
        else if (ram <= 8) {
            return "You can add ram, nut is not so necessary";
        }
        return "no need to add ram";
    }
}
