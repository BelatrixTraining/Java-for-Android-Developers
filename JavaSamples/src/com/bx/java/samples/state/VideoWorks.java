package com.bx.java.samples.state;

/**
 * Created by eduardo on 06/01/17.
 */
public class VideoWorks implements State {

    private State playState;
    private State stopState;
    private State state;


    public VideoWorks() {

        playState= new PlayState(this);
        stopState = new StopState(this);
        state= stopState;
    }

    @Override
    public void startPlay() {
        state.startPlay();
    }

    @Override
    public void stopPlay() {
        state.stopPlay();
    }

    //ALT + insert
    public State getPlayState() {
        return playState;
    }

    public void setPlayState(State playState) {
        this.playState = playState;
    }

    public State getStopState() {
        return stopState;
    }

    public void setStopState(State stopState) {
        this.stopState = stopState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
