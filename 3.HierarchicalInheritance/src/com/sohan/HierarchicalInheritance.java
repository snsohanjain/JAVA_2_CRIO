package com.sohan;

public class HierarchicalInheritance {
    public static void main(String args []){

        B obj1 = new B();
        C obj2 = new C();
        //All classes can access the method of class A
        obj1.methodA();
        obj1.methodB();
        obj2.methodA();
        obj2.methodC();
    }

}
