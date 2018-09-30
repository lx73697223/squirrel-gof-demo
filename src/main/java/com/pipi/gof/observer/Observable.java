package com.pipi.gof.observer;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 被观察者
 */
public class Observable {

    private boolean changed = false;

    private CopyOnWriteArrayList<Observer> observers = new CopyOnWriteArrayList<>();

    public synchronized void addObserver(Observer o) {
        if (o == null) {
            throw new NullPointerException();
        }
        observers.addIfAbsent(o);
    }

    public synchronized void deleteObserver(Observer o) {
        observers.remove(o);
    }

    public synchronized void deleteObservers() {
        observers.clear();
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {

        Object[] arrLocal;

        synchronized (this) {
            if (!changed) { // 状态值未改变时返回，不通知
                return;
            }
            arrLocal = observers.toArray();
            clearChanged(); // 重置状态
        }

        for (int i = arrLocal.length - 1; i >= 0; i--) {
            ((Observer) arrLocal[i]).update(this, arg);
        }
    }

    protected synchronized void clearChanged() {
        changed = false;
    }

    protected synchronized void setChanged() {
        changed = true;
    }

    public synchronized boolean hasChanged() {
        return changed;
    }

    public synchronized int countObservers() {
        return observers.size();
    }

}
