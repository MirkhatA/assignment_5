package com.company;

import com.company.interfaces.Computer;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Computer pc = new Computer() {
            public void turnOn() {
                System.out.println("The pc is on");
            }
        };

        pc.turnOn();
        pc.turnOff();

        int ram = 6;
        float price = 600;

        final Laptop y520 = Laptop.class.getConstructor(int.class, float.class).newInstance(ram, price);

        System.out.println(y520.isMemoryNeeded());
        System.out.println(y520.isCheap());
    }
}
