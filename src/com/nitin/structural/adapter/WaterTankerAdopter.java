package com.nitin.structural.adapter;

public class WaterTankerAdopter extends WaterTanker
{
    public void getWater()
    {
        System.out.println("50 Liters");
    }

    public WaterTanker getOldWater()
    {
        return new WaterTanker();
    }
}
