package com.nitin.creational.abstractfactory;

public class Print implements Icolor , Ishape
{

    @Override
    public void square()
    {
        System.out.println("[]");
    }

    @Override
    public void circle()
    {
        System.out.println("@");
    }

    @Override
    public void triangle()
    {
        System.out.println("/" + "\\");
    }

    @Override
    public void red()
    {
        System.out.println("RED");
    }

    @Override
    public void green()
    {
        System.out.println("GREEN");
    }

    @Override
    public void blue()
    {
        System.out.println("BLUE");
    }

}
