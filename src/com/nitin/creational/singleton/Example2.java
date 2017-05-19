package com.nitin.creational.singleton;

public class Example2
{
    private static Example2 object;
    private Example2()
    {

    }
    public static Example2 getInstance()
    {
        if (object == null)
            object = new Example2();
        return object;
    }
}
