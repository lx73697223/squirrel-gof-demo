package com.pipi.gof.state;

import com.google.common.collect.Range;

/**
 下午状态 */
public class AfterNoonState extends AbstractState {

    private static final Range<Integer> CURRENT_STATE_HOUR_RANGE = Range.closedOpen(14, 18);

    private static final State NEXT_STATE = new EveningState();

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
        System.out.println("当前时间：" + work.getHour() + "点。下午工作，状态不错 (#^.^#)");
    }

}

