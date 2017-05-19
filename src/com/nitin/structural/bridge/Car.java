package com.nitin.structural.bridge;

public class Car extends Vehicle
{

    public Car(WorkShop w1, WorkShop w2)
    {
        super(w1, w2);
    }

    @Override
    public void manuFacture()
    {
        System.out.print("Car ");
        w1.work();
        w2.work();
        System.out.println();
    }
}
