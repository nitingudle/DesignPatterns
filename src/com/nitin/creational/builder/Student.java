package com.nitin.creational.builder;

public class Student
{
    private Student(StudentBuilder studentBuilder)
    {
        this.name = studentBuilder.name;
        this.city = studentBuilder.city;
        this.address = studentBuilder.address;
        this.rollNo = studentBuilder.rollNo;
    }

    private final String name;
    private String       city;
    private String       address;
    private int          rollNo;

    public static class StudentBuilder
    {
        private final String name;
        private String       city;
        private String       address;
        private int          rollNo;
        public StudentBuilder(String name)
        {
            this.name = name;
        }
        public StudentBuilder addCity(String city)
        {
            this.city = city;
            return this;
        }
        public StudentBuilder addAddress(String address)
        {
            this.address = address;
            return this;
        }
        public StudentBuilder addRooNo(int rollNo)
        {
            this.rollNo = rollNo;
            return this;
        }
        public Student build()
        {
            return new Student(this);
        }
    }

    @Override
    public String toString()
    {
        String str = "Name: " + this.name;
        if (city != null)
            str += "\nCity: " + this.city;
        if (address != null)
            str += "\nAddress: " + this.address;
        if (rollNo != 0)
            str += "\nRoll No: " + this.rollNo;
        return str;
    }
}
