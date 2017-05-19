package com.nitin.creational.abstractfactory;

import com.nitin.creational.factory.IFactory;

public class Factory implements IFactory
{
    @Override
    public Icolor createColorFactory(String type) throws Exception
    {
        if ("Paint".equalsIgnoreCase(type))
            return new Paint();
        else if ("print".equalsIgnoreCase(type))
            return new Print();
        else
            throw new NullPointerException("Not a valid type");
    }

    @Override
    public Ishape createShapeFactory(String type) throws Exception
    {
        if ("Draw".equalsIgnoreCase(type))
            return new Draw();
        else if ("print".equalsIgnoreCase(type))
            return new Print();
        else
            throw new NullPointerException("Not a valid type");
    }
}
