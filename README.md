# Java-for-Android-Developers
Java for Android Developers (10h)
 
## Threads (2H)

- ¿Qué es un Thread o Hilo?

 * Permite realizar múltiples actividades dentro de un solo proceso.

 * Es un serie de instrucciones ejecutadas
 
 * Comparten memoria,archivos y estado por proceso.
 
- ¿Cómo crear un Thread?

 * Podemos crear una clase llamada "SomeThread" que extienda de Thread
 
 ```java
   public class SomeThread extends Thread{

       @Override
       public void run() {
           super.run();

           for (int i = 0; i <10 ; i++) {
               System.out.println("thread name '"+getName()+ "' i "+i);
           }
       }
   }
 ```
 * Mediante un Runnable , creamos una clase llamada "SomeRunnable"
 
  ```java
    public class SomeRunnable implements Runnable {

        @Override
        public void run() {

            for (int i = 0; i <10 ; i++) {
                System.out.println("thread name "+Thread.currentThread().getName()+" i "+i);
            }
        }
    }
 ```
 
- Algunas propiedades y métodos

 * sleep();
 
  ```java
     Thread thread  = Thread.currentThread();
           thread.setName("My Thread");

           try {
               for (int i = 0; i <10 ; i++) {
                   System.out.println("i "+i);
                   Thread.sleep(1000);
               }
           }catch (InterruptedException e){}
  ```
 * join();
 
  ```java
   import java.util.ArrayList;
   import java.util.List;

   /**
    * Created by eduardomedina on 11/01/17.
    */
   public class MainJoin {


       public static void main(String[] args) {
           System.out.println("Join Threads ");
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
  ```
 
 * wait();
 
 * start();
 
- ¿Cómo detener un Thread ?

  ```java
      public class MyThread extends Thread {

        private boolean running= true;

        @Override
        public void run() {
            super.run();
            while(running){
                System.out.println("Hello thread...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void shutdown(){
            running=false;
            System.out.println("Bye thread...");
        }
    }
  ```
  
  ```java
    MyThread myThread= new MyThread();
          myThread.start();

          System.out.println("Press return");
          Scanner scanner=new Scanner(System.in);
          scanner.nextLine();

          myThread.shutdown();
  ```
  
- Synchronized

  ```java
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

  ```
  
- Ejemplos 
 
 * Generar números primos 
 
 Regla: Un número primo solo es divisible por si mismo y por la unidad.
 
  ```java
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

  ```
  
  ```java
    public static void main(String[] args) {
        System.out.println("Main Prime Generator ");

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
  ```
 * Mostrar la fecha y hora en pantalla
 
   ```java
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
   ```
 
 * Generar sonido cada cierto tiempo
 
   ```java
     import java.awt.*;

     /**
      * Created by eduardomedina on 11/01/17.
      */
     public class BeepRunnable implements Runnable {

         private Toolkit toolkit;

         public BeepRunnable() {
             toolkit = Toolkit.getDefaultToolkit();
         }

         @Override
         public void run() {

             for (int i = 0; i <3 ; i++) {
                 toolkit.beep();
                 System.out.println("Beep!");
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }

         }
     }

   ```
   
 * Generar animaciones con Threads
 
  ```java
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

  ```
  
  ```java
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
  ```


## Procesos en background en Android

- AsyncTask

- HandlerThread

- ThreadPool

- IntentService

¿Qué es el MainThread en Android?

![mainthread](https://github.com/BelatrixTraining/Java-for-Android-Developers/blob/Lesson5/images/main_thread_android.jpeg)

![mainthread1](https://github.com/BelatrixTraining/Java-for-Android-Developers/blob/Lesson5/images/mainthreadandroid.png)

¿En que caso usar alguno de estos componentes ?

- Cuando sea requerido ejecutar procesos en background pero se necesite informar a la UI que esta pasando, por ejemplo el porcentaje del proceso . En este caso debemos usar un AsyncTask

![asynctask](https://github.com/BelatrixTraining/Java-for-Android-Developers/blob/Lesson5/images/asynctask.png)

- Cuando sea requerido ejecutar procesos en background independiente de la UI , es decir puede que la app se cierre o pause y se necesite seguir ejecutando una acciòn. En este caso podemos usar un Service.  

![service](https://github.com/BelatrixTraining/Java-for-Android-Developers/blob/Lesson5/images/service_lifecycle.png)



## Referencias 

- Java concurrency [https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html](https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html)

- Processes and Threads [https://developer.android.com/guide/components/processes-and-threads.html](https://developer.android.com/guide/components/processes-and-threads.html)

- Android Performance Patterns [https://www.youtube.com/watch?v=qk5F6Bxqhr4&list=PLWz5rJ2EKKc9CBxr3BVjPTPoDPLdPIFCE](https://www.youtube.com/watch?v=qk5F6Bxqhr4&list=PLWz5rJ2EKKc9CBxr3BVjPTPoDPLdPIFCE)

- https://github.com/toddmotto/public-apis

