package com.myapp.singleton_design_pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("requesting object for 1st time");
        Singleton.getInstance();

        System.out.println("requesting object for 2nd time");
        Singleton.getInstance();

        System.out.println("requesting object for 3rd time");
        Singleton.getInstance();

        //Let's try to clear the object and access again.
        Singleton.getInstance().clearObject();
        //Object got cleared and new object is being created.
        Singleton.getInstance();


    }
}
