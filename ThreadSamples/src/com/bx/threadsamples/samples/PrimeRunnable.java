package com.bx.threadsamples.samples;

/**
 * Created by eduardo on 10/01/17.
 */
public class PrimeRunnable implements Runnable {

    private boolean isInterrupted=false;

    public boolean isInterrupted() {
        return isInterrupted;
    }

    public void setInterrupted(boolean interrupted) {
        isInterrupted = interrupted;
    }

    @Override
    public void run() {
        long number= 0;
        while (true){
            if(isPrimer(number)){
                System.out.println("number is prime "+number);
            }
            if(isInterrupted){
                System.out.println("primer generator is interrupted");
                return;
            }
            number++;
        }
    }

    private boolean isPrimer(long value){
        if(value<=2){
            return true;
        }

        for(long i=2;i<value;i++){

            if(value %i ==0){
                return false;
            }
        }
        return true;
    }
}
