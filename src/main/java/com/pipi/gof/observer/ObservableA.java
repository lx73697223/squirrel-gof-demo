package com.pipi.gof.observer;

public class ObservableA extends Observable {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (this.state == null || !this.state.equals(state)) {
            this.state = state;

            setChanged();
            notifyObservers(state);
        }
    }
}
