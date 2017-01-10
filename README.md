# Java-for-Android-Developers
Java for Android Developers (10h)
 
## Threads (2H)


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



