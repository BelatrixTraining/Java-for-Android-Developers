## Decorator Pattern

![Starbucks](http://www.allthingstarget.com/wp-content/uploads/2012/06/Screen-shot-2012-06-28-at-8.33.03-AM.png)


``` java

  public abstract class Bebida {

      protected String desc= "Bebida";

      public abstract double cost();


      public String getDesc() {
          return desc;
      }
  }
```

```java
  package com.bx.java.samples.decorator;

  /**
   * Created by eduardomedina on 5/01/17.
   */
  public abstract class BebidaDecorator extends Bebida {
      public abstract String getDesc();
  }

```
```java
  package com.bx.java.samples.decorator;

  /**
   * Created by eduardomedina on 5/01/17.
   */
  public class Mocha extends BebidaDecorator{

      private final  Bebida bebida;

      public Mocha(Bebida bebida) {
          this.bebida = bebida;
      }

      @Override
      public double cost() {

          return 1.50+bebida.cost();
      }

      @Override
      public String getDesc() {
          return bebida.getDesc()+ " Mocha";
      }
  }

```
