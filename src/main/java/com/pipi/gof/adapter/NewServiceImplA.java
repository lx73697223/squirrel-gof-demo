package com.pipi.gof.adapter;

public class NewServiceImplA implements INewService {

    @Override
    public void doA(String value) {
        System.out.println("do A. value = " + value);
    }

    @Override
    public void doB(String value) {
        // do nothing
    }

}
