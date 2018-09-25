package com.pipi.gof.mediator;

/***
 具体的同事类，实现自己的业务，需要与其他同事通信时候，就与持有的中介者通信，中介者会负责与其他同事类交互。
 */
public class ColleagueImplA extends AbstractColleague {

    public ColleagueImplA(IMediator mediator) {
        super(mediator);
    }

    public void execute(String content) {
        System.out.println("==A execute==");
        super.mediator.execute(content, this);
    }

    public void doing(String content) {
        System.out.println("==A doing==");
    }

}
