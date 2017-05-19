package com.nitin.structural.bridge;

public abstract class Vehicle
{
    public WorkShop w1 , w2;
    public Vehicle(WorkShop w1, WorkShop w2)
    {
        this.w1 = w1;
        this.w2 = w2;
    }
    public abstract void manuFacture();
}
