package com.pipi.gof.observer;

public class ObserverImpl3 implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("==observer 3==" + arg);
    }
}
