package com.sohan;

public class MethodOverriding {
    public static void main(String args[]){
        Bank b = new Bank();
        SBI s=new SBI();
        ICICI i=new ICICI();
        System.out.println("BANK Rate of Interest: "+ b.getRateOfInterest());
        System.out.println("SBI Rate of Interest: "+ s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+ i.getRateOfInterest());
    }
}
class Bank{
    //Overridden Method
    int getRateOfInterest(){return 5;}
}
//Creating child classes
class SBI extends Bank{
    //Overriding Method
    @Override
    int getRateOfInterest(){return 8;}
}
class ICICI extends Bank{
    //Overriding Method
    @Override
    int getRateOfInterest(){return 7;}
}