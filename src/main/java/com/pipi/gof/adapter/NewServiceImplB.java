package com.pipi.gof.adapter;

public class NewServiceImplB implements INewService {

    @Override
    public void doA(String value) {
        // do nothing
    }

    @Override
    public void doB(String value) {
        System.out.println("do B. value = " + value);
    }

}
