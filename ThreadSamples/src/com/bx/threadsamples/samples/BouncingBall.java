package com.bx.threadsamples.samples;

import javax.swing.*;
import java.awt.*;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class BouncingBall extends JFrame {

    private static final int CANVAS_WIDTH = 640;
    private static final int CANVAS_HEIGHT = 480;
    private static final int UPDATE_INTERVAL = 50;

    private int x = 100;
    private int y = 100;
    private int size = 100;
    private int xSpeed = 3;
    private int ySpeed = 5;

    private DrawCanvas canvas;

    public BouncingBall() {
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        this.setContentPane(canvas);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setTitle("Bouncing Ball");
        this.setVisible(true);


        Thread updateThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    update();
                    repaint();
                    try {

                        Thread.sleep(UPDATE_INTERVAL);
                    } catch (InterruptedException ignore) {}
                }
            }
        };
        updateThread.start();
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
            super.paintComponent(g);
            setBackground(Color.BLACK);
            g.setColor(Color.BLUE);
            g.fillOval(x, y, size, size);
        }
    }
}
