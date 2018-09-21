package com.pipi.gof.adapter;

public class OldServiceImpl implements IOldService {

    private OldServiceAdapter oldServiceAdapter;

    @Override
    public void doByType(String type, String value) {

        if (type.equalsIgnoreCase("1")) {
            System.out.println("do 1. Name: " + value);
        } else if (type.equalsIgnoreCase("A") || type.equalsIgnoreCase("B")) {
            oldServiceAdapter = new OldServiceAdapter(type);
            oldServiceAdapter.doByType(type, value);
        } else {
            System.out.println("Invalid type. " + type + " not supported");
        }
    }

}
