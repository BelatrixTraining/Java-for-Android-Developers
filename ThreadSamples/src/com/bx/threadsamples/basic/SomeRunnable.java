package com.bx.threadsamples.basic;

/**
 * Created by eduardo on 10/01/17.
 */
public class SomeRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            System.out.println("thread name "+Thread.currentThread().getName()+" i "+i);
        }
    }
}
