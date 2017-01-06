package com.bx.java.samples.state;

/**
 * Created by eduardo on 06/01/17.
 */
public class StopState implements State {

    private final VideoWorks videoWorks;

    public StopState(VideoWorks videoWorks) {
        this.videoWorks = videoWorks;
    }

    @Override
    public void startPlay() {
        System.out.println("Iniciar reproducción");
        this.videoWorks.setState(videoWorks.getPlayState());
    }

    @Override
    public void stopPlay() {
        System.out.println("Actualmente no se estaba reproduciendo");
    }
}
