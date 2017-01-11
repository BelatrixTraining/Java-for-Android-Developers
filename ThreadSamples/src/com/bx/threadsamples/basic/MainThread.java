package com.bx.threadsamples.basic;

import com.bx.threadsamples.basic.SomeRunnable;

import java.util.Scanner;

/**
 * Created by eduardo on 10/01/17.
 */
public class MainThread {

    public static void main(String[] args) {
        System.out.println("Threads samples");

        //RUNNABLES

        Runnable runnable= new SomeRunnable();
        Thread threadA= new Thread(runnable);
        //Thread threadB= new Thread(runnable);

        threadA.start();
        //threadB.start();

        //THREADS

        /*Thread threadC= new SomeThread();
        threadC.setName("My Thread");
        threadC.start();*/

        //SLEEP

        /*Runnable someSleepRunnable= new SomeSleepRunnable();
        Thread threadD= new Thread(someSleepRunnable);
        threadD.start();*/

        //STOP

        /*MyThread myThread= new MyThread();
        myThread.start();

        System.out.println("Press return");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();*/


        //JOIN
        //Run MainJoin

    }
}
