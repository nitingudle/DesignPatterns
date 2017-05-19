package com.nitin.structural.bridge;

public class Bike extends Vehicle
{

    public Bike(WorkShop w1, WorkShop w2)
    {
        super(w1, w2);
    }

    @Override
    public void manuFacture()
    {
        System.out.print("Bike ");
        w1.work();
        w2.work();
        System.out.println();
    }

}
