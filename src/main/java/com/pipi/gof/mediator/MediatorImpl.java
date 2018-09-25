package com.pipi.gof.mediator;

/***
 具体中介者实现对象。它需要了解并维护各个同事对象，并负责具体的协调各同事对象的交互关系。
 */
public class MediatorImpl implements IMediator {

    private ColleagueImplA colleagueImplA;

    private ColleagueImplB colleagueImplB;

    private ColleagueImplC colleagueImplC;

    private MediatorImpl() {
        colleagueImplA = new ColleagueImplA(this);
        colleagueImplB = new ColleagueImplB(this);
        colleagueImplC = new ColleagueImplC(this);
    }

    @Override
    public void execute(String content, AbstractColleague colleague) {
        System.out.println("mediator execute..." + content);

        if (colleague instanceof ColleagueImplA) {
            colleagueImplB.doing(content);
            colleagueImplC.doing(content);
        } else if (colleague instanceof ColleagueImplB) {
            colleagueImplC.doing(content);
        } else if (colleague instanceof ColleagueImplC) {
            colleagueImplA.doing(content);
            colleagueImplB.doing(content);
        }
    }

}
