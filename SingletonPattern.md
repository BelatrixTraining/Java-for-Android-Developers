## Singleton Pattern


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

### Ejemplo en Android

MyImageLoader.java

```java
public class MyImageLoader {
    private static MyImageLoader mInstance;
    private RequestQueue mRequestQueue;
    private ImageLoader mImageLoader;
    private static Context mCtx;

    private MyImageLoader(Context context) {
        mCtx = context;
        mRequestQueue = getRequestQueue();

        mImageLoader = new ImageLoader(mRequestQueue,
                new ImageLoader.ImageCache() {
            private final LruCache<String, Bitmap>
                    cache = new LruCache<String, Bitmap>(20);

            @Override
            public Bitmap getBitmap(String url) {
                return cache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                cache.put(url, bitmap);
            }
        });
    }

    public static synchronized MyImageLoader getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new MyImageLoader(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            mRequestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

    public ImageLoader getImageLoader() {
        return mImageLoader;
    }
}

```

```java
  // Get a RequestQueue
  RequestQueue queue = MySingleton.getInstance(this.getApplicationContext()).
      getRequestQueue();
```
