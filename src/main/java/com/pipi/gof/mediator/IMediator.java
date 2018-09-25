package com.pipi.gof.mediator;

/***
 在里面定义各个同事之间交互需要的方法，可以是公共的通信方法，也可以是小范围的交互方法。
 */
public interface IMediator {

    void execute(String content, AbstractColleague colleague);

}
