package com.bx.threadsamples.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class MainJoin {
    

    public static void main(String[] args) {
        System.out.println("Main Join Threads ");
        List<SampleThread> threads= new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            SampleThread sampleThread= new SampleThread();
            threads.add(sampleThread);
            try {
                sampleThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        for (SampleThread thread:threads) {
            thread.start();
        }


    }

    public static class SampleThread extends Thread{

        @Override
        public void run() {
            super.run();

            for (int i = 0; i <10 ; i++) {
                try{
                    Thread.sleep(10);
                }catch (Exception e){}
            }
            System.out.println("thread "+getName());
        }
    }

    /*
         thread Thread-1
         thread Thread-0
         thread Thread-2
     */

    //JOIN
    /*
        thread Thread-0
        thread Thread-1
        thread Thread-2
     */
}
