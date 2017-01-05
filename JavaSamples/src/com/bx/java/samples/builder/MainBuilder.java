package com.bx.java.samples.builder;

/**
 * Created by eduardomedina on 5/01/17.
 */
public class MainBuilder {

    public static void main(String[] args) {
        System.out.println("Hello Builder Pattern");

        Picasso picasso= new Picasso.Builder()
                .with("Context")
                .load("http://i.imgur.com/DvpvklR.png")
                .into("myImageView")
                .resize(100,100)
                .build();

        /*Picasso picasso= new Picasso.Builder()
                .with("Context")
                .load("http://i.imgur.com/DvpvklR.png")
                .into("myImageView")
                .build();*/

        System.out.println("Picasso "+picasso.toString());
    }
}
