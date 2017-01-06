# Builder Pattern


# Ejemplos en Android


- AlertDialog

![alertdialog](https://developer.android.com/images/ui/dialog_custom.png)

```java
      new AlertDialog.Builder(this)
                      .setTitle("Sample Alert")
                      .setMessage("One Action Button Alert")
                      .setPositiveButton("OK",
                              new DialogInterface.OnClickListener() {
                                  public void onClick(DialogInterface dialog,
                                                      int which) {
                                      Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                                  }
                              })
                    .setNegativeButton("CANCEL",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int which) {
                                    Toast.makeText(getApplicationContext(),"No is clicked",Toast.LENGTH_LONG).show();
                                }
                            })
                      .show();
```

```java
      AlertDialog.Builder builder = new AlertDialog.Builder(
                              AlertActivity.this);
                      builder.setTitle("Sample Alert");
                      builder.setMessage("One Action Button Alert");
                      builder.setPositiveButton("OK",
                              new DialogInterface.OnClickListener() {
                                  public void onClick(DialogInterface dialog,
                                                      int which) {
                                      Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                                  }
                              });
                      builder.show();
```

- Picasso : 

    Librería para el manejo de imágenes en Android
    
    [http://square.github.io/picasso/](http://square.github.io/picasso/)

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

