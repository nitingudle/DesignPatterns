package com.nitin.creational.factory;

import com.nitin.creational.abstractfactory.Icolor;
import com.nitin.creational.abstractfactory.Ishape;

public interface IFactory
{
    public Icolor createColorFactory(String type) throws Exception;
    public Ishape createShapeFactory(String type) throws Exception;
}
