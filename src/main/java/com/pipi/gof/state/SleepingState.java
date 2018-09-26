package com.pipi.gof.state;

import com.google.common.collect.Range;

/**
 休息状态 */
public class SleepingState extends AbstractState {

    private static final Range<Integer> CURRENT_STATE_HOUR_RANGE_EVENING = Range.closed(22, 24);

    private static final Range<Integer> CURRENT_STATE_HOUR_RANGE_MORNING = Range.closedOpen(0, 9);

    private static final State NEXT_STATE = new ForenoonState();

    @Override
    public boolean inTheCurrentState(Work work) {
        return CURRENT_STATE_HOUR_RANGE_EVENING.contains(work.getHour()) ||
               CURRENT_STATE_HOUR_RANGE_MORNING.contains(work.getHour());
    }

    @Override
    public State getNextState() {
        return NEXT_STATE;
    }

    @Override
    public void doing(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点。睡觉觉 （¯﹃¯）");
    }

}
