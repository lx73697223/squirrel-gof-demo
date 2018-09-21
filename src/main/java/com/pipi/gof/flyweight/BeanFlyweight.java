package com.pipi.gof.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFlyweight {

    private static final Map<Integer, Bean> beanMap = new ConcurrentHashMap<>();

    public static Bean getBean(Integer type) {
        return beanMap.computeIfAbsent(type, t -> new Bean(t));
    }

}
