package com.bx.threadsamples.samples;

/**
 * Created by eduardo on 10/01/17.
 */
public class MainPrime {

    public static void main(String[] args) {
        System.out.println("Prime Generator sample");

        PrimeRunnable runnable= new PrimeRunnable();
        Thread primeGenerator= new Thread(runnable);
        primeGenerator.start();

        try{
            Thread.sleep(1000); // 1 segundos
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //primeGenerator.interrupt();
        runnable.setInterrupted(true);

        //output
        /*
            Main Prime Generator
            number is prime 0
            number is prime 1
            number is prime 2
            number is prime 3
            number is prime 5
            number is prime 7
            number is prime 11
            number is prime 13
            number is prime 17
            number is prime 19
            number is prime 23
            number is prime 29
            number is prime 31
            number is prime 37
            number is prime 41
            number is prime 43
            number is prime 47
            number is prime 53
            number is prime 59
            number is prime 61
            number is prime 67
            number is prime 71
            number is prime 73
            number is prime 79
            number is prime 83
            number is prime 89
            number is prime 97
            number is prime 101
            number is prime 103
            .
            .
            .
            primer generator is interrupted
         */
    }
}
