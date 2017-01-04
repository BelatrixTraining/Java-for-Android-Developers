## Factory Pattern


### Ejemplo en Android

PlaceDataStoreFactory.java

```java
public class PlaceDataStoreFactory {

    public static final  int DB=1;
    public static final  int CLOUD=2;
    public static final  int PREFERENCES=3;

    private final Context context;

    public PlaceDataStoreFactory(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Constructor parameters cannot be null!!!");
        }
        this.context = context;
    }

    public PlaceDataStore create(int dataSource)
    {
        PlaceDataStore placeDataStore=null;

        switch (dataSource)
        {
            case CLOUD:
                placeDataStore= new RestPlaceDataStore();
                break;
            case DB:
                placeDataStore= new DbPlaceDataStore();
                break;
            case PREFERENCES:
                placeDataStore= new PreferencesPlaceDataStore(context);
                break;
        }
        return placeDataStore;
    }
}
``` 
