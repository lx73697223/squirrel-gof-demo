package com.pipi.gof.mediator;

public class ColleagueImplB extends AbstractColleague {

    public ColleagueImplB(IMediator mediator) {
        super(mediator);
    }

    public void execute(String content) {
        System.out.println("==B execute==");
        super.mediator.execute(content, this);
    }

    public void doing(String content) {
        System.out.println("==B doing==");
    }

}
