package com.nitin.creational.factory;

public class Teacher implements IOperations
{

    @Override
    public void createOperation()
    {
        System.out.println("Teacher Create Operation...");
    }

    @Override
    public void deleteOperation()
    {
        System.out.println("Teacher Delete Operation...");
    }

    @Override
    public void insertOperation()
    {
        System.out.println("Teacher Insert Operation...");
    }

    @Override
    public void searchOperation()
    {
        System.out.println("Teacher Search Operation...");
    }
}
