## Mapper 

``` java
package com.bx.java.samples.mapper;

/**
 * Created by eduardo on 06/01/17.
 */
public class User {

    private int id;
    private String name;
    private String lastName;
    private String dni;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}

```

``` java
package com.bx.java.samples.mapper;

/**
 * Created by eduardo on 06/01/17.
 */
public class UserEntity {

    private int userId;
    private String nombre;
    private String apellidos;
    private String numDoc;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numDoc='" + numDoc + '\'' +
                '}';
    }
}

```

``` java
package com.bx.java.samples.mapper;

/**
 * Created by eduardo on 06/01/17.
 */
public class UserMapper {

    public User transform(UserEntity userEntity){
        User user= new User();
        if(userEntity==null)return user;

        user.setId(userEntity.getUserId());
        user.setDni(userEntity.getNumDoc()); //Integer.parseInt();
        user.setName(userEntity.getNombre());
        user.setLastName(userEntity.getApellidos());

        return user;
    }
}

```
