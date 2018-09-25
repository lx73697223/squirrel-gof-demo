package com.pipi.gof.mediator;

/***
 同事类的定义，通常为抽象类，主要约束同事对象的类型，并实现一些具体同事类之间的公共功能，
 比如，每个具体同事类都应该知道中介者对象，也就是具体同事类都会持有中介者对象，都可以到这个类里面。
 */
public abstract class AbstractColleague {

    protected IMediator mediator;

    public AbstractColleague(IMediator mediator) {
        this.mediator = mediator;
    }

}
