package com.pipi.gof.bridge;

/**
 桥接模式 BridgeServiceImpl
    将抽象部分与实现部分分离，使它们都可以独立的变化。
    在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
    桥接模式中的脱耦，是指抽象化和实现化之间使用组合/聚合关系，而不是继承关系，从而使两者可以相对独立地变化。

    优点：
        1、抽象和实现的分离。
        2、优秀的扩展能力。
        3、实现细节对客户透明。

    缺点；
        桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 */
