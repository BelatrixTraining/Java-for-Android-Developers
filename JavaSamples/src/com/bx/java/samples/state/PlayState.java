package com.bx.java.samples.state;

/**
 * Created by eduardo on 06/01/17.
 */
public class PlayState implements State {

    private final VideoWorks videoWorks;

    public PlayState(VideoWorks videoWorks) {
        this.videoWorks = videoWorks;
    }

    @Override
    public void startPlay() {
        System.out.println("Actualmente se esta reproduciendo");
    }

    @Override
    public void stopPlay() {
        System.out.println("Detener reproducción");
        videoWorks.setState(videoWorks.getStopState());
    }
}
