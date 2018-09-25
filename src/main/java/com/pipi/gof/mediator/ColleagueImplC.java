package com.pipi.gof.mediator;

public class ColleagueImplC extends AbstractColleague {

    public ColleagueImplC(IMediator mediator) {
        super(mediator);
    }

    public void execute(String content) {
        System.out.println("==C execute==");
        super.mediator.execute(content, this);
    }

    public void doing(String content) {
        System.out.println("==C doing==");
    }

}
