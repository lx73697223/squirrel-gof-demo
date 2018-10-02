package com.pipi.gof.proxy.jdkdynamic;

public class Client {

    public static void main(String[] args) {

        IProxiedService service = new ProxiedServiceImpl();
        JdkInvocationHandler invocationHandler = new JdkInvocationHandler();

        IProxiedService proxyService = invocationHandler.getProxyInstance(service);

        service.doing("ABC");

        System.out.println("=====");

        proxyService.doing("ABC");
    }

}
