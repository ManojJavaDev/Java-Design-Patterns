package com.myapp.singleton_design_pattern;

//Efficient way of creating singleton object with thread safe.
public class Singleton {
    //Volatile ensures the multiple threads offer the thread variable correctly when it is being initialized in singleton class
    private static volatile Singleton obj = null;
    private Singleton() {
    }

    public void clearObject(){
        Singleton.obj = null;
    }


    public static Singleton getInstance(){
        if(obj == null){
            System.out.println("Object doesn't exist --- New object being created");
            //making singleton object thread safe.
            synchronized(Singleton.class){
                if(obj==null){
                    obj = new Singleton();
                }
            }
        }
        System.out.println("Object already created --- already created object will be returned, No new object will be created.");
        return obj;
    }


}
