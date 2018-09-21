package com.pipi.gof.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PrototypeCache {

    private static Map<String, AbstractPrototypeBean> beanMap = new ConcurrentHashMap<>();

    public static AbstractPrototypeBean getBean(String id) {
        AbstractPrototypeBean cachedBean = beanMap.get(id);
        return (AbstractPrototypeBean) cachedBean.clone();
    }

    public static void loadCache() {
        PrototypeBean1 bean1 = new PrototypeBean1();
        bean1.setId("1");
        beanMap.put(bean1.getId(), bean1);

        PrototypeBean2 bean2 = new PrototypeBean2();
        bean2.setId("2");
        beanMap.put(bean2.getId(), bean2);

        PrototypeBean3 bean3 = new PrototypeBean3();
        bean3.setId("3");
        beanMap.put(bean3.getId(), bean3);
    }

}
