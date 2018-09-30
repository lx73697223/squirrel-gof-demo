package com.pipi.gof.memento;

/**
 备忘录模式 Memento
    在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便在适当的时候恢复对象。
    1、为了符合迪米特原则，还要增加一个管理备忘录的类。
    2、为了节约内存，可使用原型模式+备忘录模式。

 特点：
    1. 保持封装边界。使用备忘录可以避免暴露一些只应由Originator管理却又必须存储在Originator之外的信息。
       该模式把可能很复杂的Originator内部信息对其他对象屏蔽起来，从而保持了封装边界。

    2. 简化Originator。在其他的保持封装性的设计中，Originator负责保持Client请求过的内部状态版本。
       把所存储管理的重任交给了Originator，让Client管理它们请求的状态将会简化Originator，
       并使得Client工作结束时无需通知Originator。
 */
