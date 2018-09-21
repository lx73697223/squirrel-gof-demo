package com.pipi.gof.bridge;

public class BridgeServiceImpl extends AbstractBridgeService {

    private String name;

    private String value;

    public BridgeServiceImpl(String name, String value, IServiceA iServiceA) {
        super(iServiceA);
        this.name = name;
        this.value = value;
    }

    @Override
    public void doA() {
        iServiceA.doA(name, value);
    }

}
