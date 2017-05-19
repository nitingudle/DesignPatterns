package com.nitin.creational.factory;

public class Main
{
    public static void main(String asdf[]) throws Exception
    {
        OperationFactory oFactory = new OperationFactory();
        IOperations student = oFactory.operationInstance("Student");
        IOperations department = oFactory.operationInstance("Department");
        IOperations teacher = oFactory.operationInstance("Teacher");

        student.createOperation();
        department.createOperation();
        teacher.createOperation();
        System.out.println("========================================");
        student.insertOperation();
        department.insertOperation();
        teacher.insertOperation();
        System.out.println("========================================");
        student.deleteOperation();
        department.deleteOperation();
        teacher.deleteOperation();
        System.out.println("========================================");
        student.searchOperation();
        department.searchOperation();
        teacher.searchOperation();
    }
}
