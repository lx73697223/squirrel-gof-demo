package com.pipi.gof.state;

public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("stop state do action");
        context.setState(this);
    }

    public String doing() {
        return "Stop State";
    }

}
