package com.nitin.creational.builder;

public class Main
{
    public static void main(String adf[]) throws Exception
    {
        Student s = new Student.StudentBuilder("Nitin").addCity("Bangalore").build();
        System.out.println(s);
    }
}
