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
