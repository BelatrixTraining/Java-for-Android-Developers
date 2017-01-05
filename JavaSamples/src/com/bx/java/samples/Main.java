package com.bx.java.samples;

import com.bx.java.samples.singleton.MySingleton;

/**
 * Created by eduardomedina on 4/01/17.
 */
public class Main {

    public static void main(String[] args)
    {
        System.out.print("Hello Java !");

        MySingleton mySingleton1= MySingleton.getInstance();
        MySingleton mySingleton2= MySingleton.getInstance();

        System.out.print("\n");
        System.out.println("Singleton 1 "+mySingleton1);
        System.out.println("Singleton 2 "+mySingleton2);
    }

}
