package com.pipi.gof.factory.simple;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 简单工厂，利用类名反射获取对象
 */
@Component
public class SimpleReflectionFactory implements BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public ISimpleFactoryBean getBean(Integer index) {
        if (index == null) {
            return null;
        }

        return beanFactory.getBean("SimpleFactoryBeanImpl" + index, ISimpleFactoryBean.class);
    }

}
