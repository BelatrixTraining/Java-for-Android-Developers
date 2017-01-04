# Builder Pattern


# Ejemplo en Android

Picasso : Librería para el manejo de imágenes en Android

Link [http://square.github.io/picasso/](http://square.github.io/picasso/)

```java
  Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(imageView);
``` 

```java
  Picasso.with(context)
    .load(url)
    .resize(50, 50)
    .centerCrop()
    .into(imageView)
``` 

```java
  Picasso.with(context)
      .load(url)
      .placeholder(R.drawable.user_placeholder)
      .error(R.drawable.user_placeholder_error)
      .into(imageView);
``` 

