package com.nitin.creational.abstractfactory;

public class Paint implements Icolor
{

    @Override
    public void red()
    {
        System.out.println("Painting RED Color...");
    }

    @Override
    public void green()
    {
        System.out.println("Painting GREEN Color...");
    }

    @Override
    public void blue()
    {
        System.out.println("Painting BLUE Color...");
    }

}
