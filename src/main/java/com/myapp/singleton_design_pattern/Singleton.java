package com.myapp.singleton_design_pattern;

//Efficient way of creating singleton object with thread safe.
public class Singleton {
    //Volatile ensures the multiple threads offer the thread variable correctly when it is being initialized in singleton class
    private static volatile Singleton obj = null;
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(obj == null){
            //making singleton object thread safe.
            synchronized(Singleton.class){
                if(obj==null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }


}
