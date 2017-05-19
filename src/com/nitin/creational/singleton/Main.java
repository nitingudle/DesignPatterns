package com.nitin.creational.singleton;

public class Main
{
    public static void main(String adad[]) throws Exception
    {
        // Compiler Error
        // Example1 ex1=new Example1()
        // Example2 ex2=new Example2();

        // Another way to create instance
        Example1 ex1 = Example1.object;
        Example1 ex2 = Example1.object;
        System.out.println("Instance 1 Of Example1 Class: " + ex1.hashCode());
        System.out.println("Instance 2 Of Example1 Class: " + ex2.hashCode());
        System.out.println("=====================================");
        Example2 ex21 = Example2.getInstance();
        Example2 ex22 = Example2.getInstance();
        System.out.println("Instance 1 of Example2 Class: " + ex21.hashCode());
        System.out.println("Instance 2 of Example2 Class: " + ex22.hashCode());
        System.out.println("=====================================");
        Example3 ex31 = Example3.object;
        Example3 ex32 = Example3.object;
        System.out.println("Instance 1 of Example3 EnumClass: " + ex32.hashCode());
        System.out.println("Instance 2 of Example4 EnumClass: " + ex32.hashCode());
    }
}
