package com.pipi.gof.state;

import com.google.common.collect.Range;

/**
 晚上状态 */
public class EveningState implements State {

    private static final Range<Integer> CURRENT_STATE_HOUR_RANGE = Range.closedOpen(18, 23);

    private static final State NEXT_STATE = new AfterWorkState();

    public boolean inTheCurrentState(Work work) {
        return CURRENT_STATE_HOUR_RANGE.contains(work.getHour());
    }

    public State getNextState() {
        return NEXT_STATE;
    }

    public void doing(Work work) {
        System.out.print("当前时间：" + work.getHour() + "点。");

        if (work.isFinished()) {
            System.out.println("下班了 凸^-^凸");

            work.setCurrentState(getNextState());
            work.doAction();
        } else {
            System.out.println("加班吧 (｡ì _ í｡)");
        }
    }

    @Override
    public void doAction(Work work) {
        if (work != null) {
            if (inTheCurrentState(work)) {
                doing(work);
            } else {
                if (!work.isFinished()) {
                    System.out.println("当前时间：" + work.getHour() + "点。下班吧 (╯﹏╰）");

                    work.setCurrentState(getNextState());
                    work.doAction();
                }
            }
        }
    }

}
