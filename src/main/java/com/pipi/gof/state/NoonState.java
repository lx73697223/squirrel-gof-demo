package com.pipi.gof.state;

import com.google.common.collect.Range;

/**
 中午状态 */
public class NoonState extends AbstractState {

    private static final Range<Integer> CURRENT_STATE_HOUR_RANGE = Range.closedOpen(12, 14);

    private static final State NEXT_STATE = new AfterNoonState();

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
        System.out.println("当前时间：" + work.getHour() + "点。吃饭睡觉打豆豆 ( ´▽｀)");
    }

}
