package com.bx.threadsamples.basic;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class MyThread extends Thread {

    private boolean running= true;

    @Override
    public void run() {
        super.run();
        while(running){
            System.out.println("Hello thread...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running=false;
        System.out.println("Bye thread...");
    }
}
