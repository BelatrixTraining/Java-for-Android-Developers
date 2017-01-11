package com.bx.threadsamples.synchronize;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class MainSynchronized {

    private int count =0;
    //private volatile  int count =0;

    public static void main(String[] args) {
        System.out.println("Main Synchronized");

        MainSynchronized myApp= new MainSynchronized();
        myApp.startThreads();

    }

    private synchronized void increment(){
    //private  void increment(){
        count++;
    }

    public void startThreads(){

        Thread thread01= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    increment();
                }
            }
        });

        Thread thread02= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    increment();
                }
            }
        });

        thread01.start();
        thread02.start();

        System.out.println("total "+count);

        //total 1715
        //total volatil  1693
        //total synchronize 2000

    }
}
