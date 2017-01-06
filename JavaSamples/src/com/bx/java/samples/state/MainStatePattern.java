package com.bx.java.samples.state;

/**
 * Created by eduardo on 06/01/17.
 */
public class MainStatePattern {

    private static  final int PLAY= 1;
    private static final int STOP= 0;

    private static  int state=1;

    private static void doPlay( ){

        if(state == PLAY)
        {
            System.out.println("Actualmente se esta reproduciendo");
        }
        else if (state == STOP)
        {
            System.out.println("Reproducir vídeo");
        }
    }

    private static void sampleVideo(){
        state=0;
        doPlay();

        state=1;
        doPlay();
    }

    public static void main(String[] args) {
        System.out.println("State Patern");

        //sampleVideo();

        VideoWorks videoWorks= new VideoWorks();
        videoWorks.startPlay();
        videoWorks.startPlay();

        videoWorks.stopPlay();
        videoWorks.stopPlay();

    }
}
