package com.bx.threadsamples.basic;

import com.bx.threadsamples.basic.SomeRunnable;

/**
 * Created by eduardo on 10/01/17.
 */
public class MainThread {

    public static void main(String[] args) {
        System.out.println("MainThread thread samples");

        //RUNNABLES
        Runnable runnable= new SomeRunnable();
        Thread threadA= new Thread(runnable);
        Thread threadB= new Thread(runnable);

        threadA.start();
        threadB.start();

        //THREADS
        /*SomeThread someThread= new SomeThread();
        someThread.start();*/

        //SLEEP
        /*Thread thread  = Thread.currentThread();
        thread.setName("My Thread");

        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println("i "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){}*/


        //JOIN

    }
}
