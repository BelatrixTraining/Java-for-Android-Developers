package com.bx.threadsamples.samples;

import javax.swing.*;
import java.awt.*;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class BouncingBall extends JFrame {

    private static final int CANVAS_WIDTH = 640;
    private static final int CANVAS_HEIGHT = 480;
    private static final int UPDATE_INTERVAL = 50; // milliseconds

    private int x = 100;     // top-left (x, y)
    private int y = 100;
    private int size = 250;  // width and height
    private int xSpeed = 3;  // moving speed in x and y directions
    private int ySpeed = 5;  // displacement per step in x and y

    private DrawCanvas canvas;

    public BouncingBall() {
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        this.setContentPane(canvas);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setTitle("Bouncing Ball");
        this.setVisible(true);

        // Create a new thread to run update at regular interval
        Thread updateThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    update();   // update the (x, y) position
                    repaint();  // Refresh the JFrame. Called back paintComponent()
                    try {
                        // Delay and give other thread a chance to run
                        Thread.sleep(UPDATE_INTERVAL);  // milliseconds
                    } catch (InterruptedException ignore) {}
                }
            }
        };
        updateThread.start(); // called back run()
    }

    public void update() {
        x += xSpeed;
        y += ySpeed;
        if (x > CANVAS_WIDTH - size || x < 0) {
            xSpeed = -xSpeed;
        }
        if (y > CANVAS_HEIGHT - size || y < 0) {
            ySpeed = -ySpeed;
        }
    }


    class DrawCanvas extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);  // paint parent's background
            setBackground(Color.BLACK);
            g.setColor(Color.BLUE);
            g.fillOval(x, y, size, size);  // draw a circle
        }
    }
}
