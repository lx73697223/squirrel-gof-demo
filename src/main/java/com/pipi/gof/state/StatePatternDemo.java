package com.pipi.gof.state;

import java.util.Random;

public class StatePatternDemo {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Work work = new Work();
        work.doAction();

        for (int i = work.getHour() + 1; i < 24; i++) {
            work.setHour(i);
            work.doAction();
        }

        System.out.println("====给一个完成工作的可能====");

        for (int i = 8; i < 24; i++) {
            work.setHour(i);
            work.setFinished(RANDOM.nextBoolean());
            work.doAction();
        }
    }

}
