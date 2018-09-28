package com.pipi.gof.adapter.classadapter;

public class Client {

    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.doing("thename", "thevalue");
    }

}
