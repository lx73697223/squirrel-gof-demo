package com.pipi.gof.proxy.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 JDK代理类
 实现InvocationHandler类JdkInvocationHandler
 */
public class JdkInvocationHandler implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy doing start...");

        Object result = method.invoke(this.target, args);

        System.out.println("proxy doing end. result = " + result);

        return result;
    }

    public <T> T getProxyInstance(T target) {
        this.target = target;
        Class clazz = this.target.getClass();
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

}
