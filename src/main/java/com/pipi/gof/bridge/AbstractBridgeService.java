package com.pipi.gof.bridge;

public abstract class AbstractBridgeService {

    protected IServiceA iServiceA;

    protected AbstractBridgeService(IServiceA iServiceA) {
        this.iServiceA = iServiceA;
    }

    public abstract void doA();

}
