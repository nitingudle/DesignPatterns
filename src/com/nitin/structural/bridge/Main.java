package com.nitin.structural.bridge;

public class Main
{
    public static void main(String sadf[])
    {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manuFacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manuFacture();
    }
}
