package com.bx.java.samples.builder;

/**
 * Created by eduardomedina on 5/01/17.
 */
public class Picasso {

    private String path;
    private Object context;
    private Object imageView;
    private int width;
    private int heigth;

    public Picasso(Builder builder){
        this.path= builder.path;
        this.context= builder.context;
        this.imageView= builder.imageView;
        this.width= builder.width;
        this.heigth= builder.heigth;

        loadImage();
    }

    private void loadImage() {
        System.out.println("loadImage path "+path+ " imageView "+imageView);
    }


    @Override
    public String toString() {
        return "Picasso{" +
                "path='" + path + '\'' +
                ", context=" + context +
                ", imageView=" + imageView +
                ", width=" + width +
                ", heigth=" + heigth +
                '}';
    }

    public static class Builder{

        private String path;
        private Object context;
        private Object imageView;
        private int width;
        private int heigth;

        public Picasso build(){

            return new Picasso(this);
        }

        public Builder with(Object context){
            this.context=context;
            return this;
        }

        public Builder load(String path){
            this.path= path;
            return this;
        }

        public Builder resize(int w, int h){
            this.width= w;
            this.heigth= h;

            return this;
        }

        public Builder into(Object imageView){
            this.imageView= imageView;
            return this;
        }
    }
}
