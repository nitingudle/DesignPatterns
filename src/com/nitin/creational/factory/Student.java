package com.nitin.creational.factory;

public class Student implements IOperations
{

    @Override
    public void createOperation()
    {
        System.out.println("Student Create Operation...");
    }

    @Override
    public void deleteOperation()
    {
        System.out.println("Student Delete Operation...");
    }

    @Override
    public void insertOperation()
    {
        System.out.println("Student Insert Operation...");
    }

    @Override
    public void searchOperation()
    {
        System.out.println("Student Search Operation...");
    }

}
