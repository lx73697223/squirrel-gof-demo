package com.pipi.gof.state;

import com.google.common.collect.Range;

/**
 上午状态 */
public class ForenoonState extends AbstractState {

    private static final Range<Integer> CURRENT_STATE_HOUR_RANGE = Range.closedOpen(9, 12);

    private static final State NEXT_STATE = new NoonState();

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
        System.out.println("当前时间：" + work.getHour() + "点。上午工作，精神百倍 (^з^)-☆");
    }

}
