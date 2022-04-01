package com.sohan;

public class MultilevelInheritance {
    public static void main(String args[])
    {
        C obj = new C();
        obj.methodA(); //calling grandparent class method
        obj.methodB(); //calling parent class method
        obj.methodC(); //calling local method
    }
}
