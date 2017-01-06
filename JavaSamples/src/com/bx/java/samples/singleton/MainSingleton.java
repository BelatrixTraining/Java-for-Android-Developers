package com.bx.java.samples.singleton;

/**
 * Created by eduardo on 06/01/17.
 */
public class MainSingleton {

    public static void main(String[] args) {
        System.out.println("Singleton Pattern");
        System.out.println("Singleton 1 "+MySingleton.getInstance());
        System.out.println("Singleton 2 "+MySingleton.getInstance());
        System.out.println("Singleton 3 "+MySingleton.getInstance());
    }
}
