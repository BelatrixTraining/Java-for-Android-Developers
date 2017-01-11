package com.bx.threadsamples.samples;

import java.awt.*;
import java.util.Date;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class MainDigitalClock extends java.applet.Applet implements Runnable{

    Font font= new Font("TimesRoman", Font.BOLD,24);
    Date time;
    Thread runner;

    @Override
    public void start() {
        super.start();
        if(runner==null){
            runner= new Thread(this);
            runner.start();
        }
    }

    @Override
    public void stop() {
        super.stop();

        if(runner!=null){
            runner.stop();
            runner=null;
        }
    }

    @Override
    public void run() {
        while (true){
            time= new Date();
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(font);
        g.drawString(time.toString(),10,50);
    }
}