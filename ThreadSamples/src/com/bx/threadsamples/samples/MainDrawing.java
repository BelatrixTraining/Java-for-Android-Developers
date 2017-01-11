package com.bx.threadsamples.samples;

import javax.swing.*;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class MainDrawing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BouncingBall(); // Let the constructor do the job
            }
        });
    }
}
