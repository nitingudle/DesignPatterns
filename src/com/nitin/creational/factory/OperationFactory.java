package com.nitin.creational.factory;

public class OperationFactory
{
    public IOperations operationInstance(String str) throws Exception
    {
        if ("Student".equalsIgnoreCase(str))
            return new Student();
        else if ("Teacher".equalsIgnoreCase(str))
            return new Teacher();
        else if ("Department".equalsIgnoreCase(str))
            return new Department();
        else
            throw new NullPointerException("Not a valid criteria");
    }
}
