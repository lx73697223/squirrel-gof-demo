package com.pipi.gof.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        ObservableA observableA = new ObservableA();

        observableA.addObserver(new ObserverImpl1());
        observableA.addObserver(new ObserverImpl2());

        observableA.setState("A");
    }

}
