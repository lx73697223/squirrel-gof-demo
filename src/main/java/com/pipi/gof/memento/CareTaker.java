package com.pipi.gof.memento;

import java.util.Stack;

/**
 负责保存备忘录
 不能对备忘录的内容进行操作或检查
 */
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
