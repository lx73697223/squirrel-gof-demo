package com.pipi.gof.memento;

import java.util.Stack;

public class CareTaker {

    private Stack<Memento> mementos = new Stack<>();

    public void addMemento(Memento memento) {
        this.mementos.push(memento);
    }

    public Memento get(int index) {
        return this.mementos.get(index);
    }

    public Memento pop() {
        if (!this.mementos.isEmpty()) {
            return this.mementos.pop();
        } else {
            return null;
        }
    }
}
