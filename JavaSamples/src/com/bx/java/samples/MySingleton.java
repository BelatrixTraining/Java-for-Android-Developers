package com.bx.java.samples;

/**
 * Created by eduardomedina on 4/01/17.
 */
public class MySingleton {

    private static MySingleton instance=null;

    public static  MySingleton getInstance(){
        if(instance==null){
            instance= new MySingleton();
        }
        return instance;
    }
}
