package com.pipi.gof.adapter.classadapter;

import com.pipi.gof.adapter.objectadapter.Adapter;
import com.pipi.gof.adapter.objectadapter.Target;

public class Client {

    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.doing("thename", "thevalue");
    }

}
