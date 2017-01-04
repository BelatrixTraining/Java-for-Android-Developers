package com.bx.java.samples;

/**
 * Created by pjohnson on 4/01/17.
 */

public abstract class Trabajador extends Persona {

    private String id;
    private String tutorName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public abstract String trabajar();
}
