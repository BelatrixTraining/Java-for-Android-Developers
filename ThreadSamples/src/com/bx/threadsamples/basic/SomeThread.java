package com.bx.threadsamples.basic;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class SomeThread extends Thread{

    @Override
    public void run() {
        super.run();

        for (int i = 0; i <10 ; i++) {
            System.out.println("thread name '"+getName()+ "' i "+i);
        }
    }
}
