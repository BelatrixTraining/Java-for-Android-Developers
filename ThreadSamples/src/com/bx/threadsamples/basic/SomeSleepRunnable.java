package com.bx.threadsamples.basic;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class SomeSleepRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            System.out.println("thread sleep i "+i);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
