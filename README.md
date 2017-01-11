# Java-for-Android-Developers
Java for Android Developers (10h)
 
## Threads (2H)

- ¿Qué es un Thread o Hilo?

- Crear un Thread

 * Podemos crear la clase llamada "SomeThread" que extienda de Thread
 
 ```java
  public class SomeThread extends Thread{

    @Override
    public void run() {
        super.run();

        for (int i = 0; i <10 ; i++) {
            System.out.println(" counter "+i);
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
              System.out.println("thread name "+Thread.currentThread().getName()+" counter "+i);
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
 
 * wait();
 
 * start();
 
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



