package com.pipi.gof.memento;

public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");

        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");

        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

        originator.getStateFromMemento(careTaker.pop());
        System.out.println("undo State: " + originator.getState());

        /*
        First saved State: State #2
        Second saved State: State #3
        Current State: State #4
        undo State: State #3
        */
    }

}
