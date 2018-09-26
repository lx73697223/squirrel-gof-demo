package com.pipi.gof.state;

import com.google.common.collect.Range;

/**
 下班状态 */
public class AfterWorkState extends AbstractState {

    private static final Range<Integer> CURRENT_STATE_HOUR_RANGE = Range.closedOpen(18, 22);

    private static final State NEXT_STATE = new SleepingState();

    @Override
    public boolean inTheCurrentState(Work work) {
        return CURRENT_STATE_HOUR_RANGE.contains(work.getHour());
    }

    @Override
    public State getNextState() {
        return NEXT_STATE;
    }

    @Override
    public void doing(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点。下班了，嗨起来 (*^o^*)");
    }

}

