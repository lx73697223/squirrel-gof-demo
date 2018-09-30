package com.pipi.gof.memento;

/**
 创建一个备忘录，记录当前时刻的内部状态。
 使用备忘录恢复内部状态。
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public Memento saveStateToMemento() {
        return new Memento(this.state);
    }

    public void getStateFromMemento(Memento Memento) {
        this.state = Memento.getState();
    }
}
