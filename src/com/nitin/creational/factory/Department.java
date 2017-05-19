package com.nitin.creational.factory;

public class Department implements IOperations
{

    @Override
    public void createOperation()
    {
        System.out.println("Department Create Operation...");
    }

    @Override
    public void deleteOperation()
    {
        System.out.println("Department Delete Operation...");
    }

    @Override
    public void insertOperation()
    {
        System.out.println("Department Insert Operation...");
    }

    @Override
    public void searchOperation()
    {
        System.out.println("Department Search Operation...");
    }
}
