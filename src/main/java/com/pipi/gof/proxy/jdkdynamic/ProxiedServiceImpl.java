package com.pipi.gof.proxy.jdkdynamic;

public class ProxiedServiceImpl implements IProxiedService {

    @Override
    public boolean doing(String name) {
        System.out.println("service doing...");
        return true;
    }

}
