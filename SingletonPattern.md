## Singleton Pattern

### Ejemplo en Android

MySingleton.java

```java
  package com.bx.java.samples;

  /**
   * Created by eduardomedina.
   */
  public class MySingleton {

      private static MySingleton instance=null;

      public static  MySingleton getInstance(){
      
          if(instance==null){
              instance= new MySingleton();
          }
          return instance;
      }
  }

``` 
