package com.pipi.gof.state;

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("start state do action");
        context.setState(this);
    }

    public String doing() {
        return "Start State";
    }

}
