package com.bx.threadsamples.samples;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class MainBeep {

    public static void main(String[] args) {

        System.out.println("Main Beep");
        Thread thread= new Thread(new BeepRunnable());
        thread.start();
    }
}
