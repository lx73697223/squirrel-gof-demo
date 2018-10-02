package com.pipi.gof.state;

import com.google.common.collect.Range;
import com.pi.common.utils.exceptions.BadInputException;

public class Work {

    private static final Range<Integer> HOUR_RANGE = Range.closedOpen(0, 24);

    // 工作时间
    private int hour;

    private boolean finished;

    private State currentState;

    public Work(int hour, State currentState) {
        setHour(hour);
        setCurrentState(currentState);
    }

    // 默认初始为上午9点状态
    public Work() {
        this(9, new ForenoonState());
    }

    // 完成工作内容
    public void doAction() {
        currentState.doAction(this);
    }

    public void validateHour(int hour) {
        if (!HOUR_RANGE.contains(hour)) {
            throw new BadInputException();
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

}
