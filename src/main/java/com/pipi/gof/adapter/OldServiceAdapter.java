package com.pipi.gof.adapter;

public class OldServiceAdapter implements IOldService {

    private INewService iNewService;

    public OldServiceAdapter(String type) {
        if (type.equalsIgnoreCase("A")) {
            iNewService = new NewServiceImplA();
        } else if (type.equalsIgnoreCase("B")) {
            iNewService = new NewServiceImplB();
        }
    }

    @Override
    public void doByType(String type, String value) {
        if (type.equalsIgnoreCase("A")) {
            iNewService.doA(value);
        } else if (type.equalsIgnoreCase("B")) {
            iNewService.doB(value);
        }
    }

}
