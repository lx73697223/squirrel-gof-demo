package com.pipi.gof.bridge;

public class BridgeServiceImpl extends AbstractBridgeService {

    private String name;

    private String value;

    public BridgeServiceImpl(String name, String value, IServiceA iServiceA) {
        super(iServiceA);
        this.name = name;
        this.value = value;
    }

    public void doA() {
        doA(name, value);
    }

    @Override
    public void doA(String name, String value) {
        iServiceA.doA(name, value);
    }

}
