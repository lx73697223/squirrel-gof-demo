package com.pipi.gof.observer;

public class ObserverImpl2 implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("==observer 2==" + arg);
    }
}
