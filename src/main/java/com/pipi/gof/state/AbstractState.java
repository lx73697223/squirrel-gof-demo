package com.pipi.gof.state;

public abstract class AbstractState implements State {

    public abstract boolean inTheCurrentState(Work work);

    public abstract State getNextState();

    protected abstract void doing(Work work);

    @Override
    public void doAction(Work work) {
        if (work != null) {
            if (inTheCurrentState(work)) {
                doing(work);
            } else {
                work.setCurrentState(getNextState());
                work.doAction();
            }
        }
    }

}
