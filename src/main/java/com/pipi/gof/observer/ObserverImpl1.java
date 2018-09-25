package com.pipi.gof.observer;

public class ObserverImpl1 implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("==observer 1==" + arg);
    }
}
