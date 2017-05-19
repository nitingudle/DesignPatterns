package com.nitin.creational.abstractfactory;

public class Draw implements Ishape
{

    @Override
    public void square()
    {
        System.out.println("Drawing Square....");
    }

    @Override
    public void circle()
    {
        System.out.println("Drawaing Circle....");
    }

    @Override
    public void triangle()
    {
        System.out.println("Drawing Triangle....");
    }
}
