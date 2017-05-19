package com.nitin.creational.abstractfactory;

public class Main
{
    public static void main(String asf[]) throws Exception
    {
        Factory factory = new Factory();
        Ishape draw = factory.createShapeFactory("Draw");
        Icolor paint = factory.createColorFactory("paint");
        Ishape printShape = factory.createShapeFactory("print");
        Icolor printColor = factory.createColorFactory("print");

        draw.circle();
        printShape.circle();
        paint.red();
        printColor.red();
        System.out.println("======================================");
        draw.square();
        printShape.square();
        paint.blue();
        printColor.blue();
        System.out.println("======================================");
        draw.triangle();
        printShape.triangle();
        paint.green();
        printColor.green();
    }
}
