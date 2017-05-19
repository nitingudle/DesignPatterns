package com.nitin.structural.adapter;

public class Main
{
    public static void main(String sdf[])
    {
        WaterTank wt=new WaterTank();
        WaterTankerAdopter wta=new WaterTankerAdopter();
        wt.storeWater(wta);
        wt.storeWater(wta.getOldWater());
    }
}
