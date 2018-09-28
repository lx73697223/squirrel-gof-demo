package com.pipi.gof.bridge;

/**
 存在于多个实体中的共同的概念性联系，即为抽象化。
 作为一个过程，抽象化就是忽略一些信息，从而把不同的实体当做同样的实体对待。 */
public abstract class AbstractBridgeService {

    protected IServiceA iServiceA;

    protected AbstractBridgeService(IServiceA iServiceA) {
        this.iServiceA = iServiceA;
    }

    public IServiceA getiServiceA() {
        return iServiceA;
    }

    public void setiServiceA(IServiceA iServiceA) {
        this.iServiceA = iServiceA;
    }

    abstract void doA(String name, String value);

}
