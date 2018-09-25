package com.pipi.gof.proxy;

public class BeanProxyImpl implements IBean {

    private String value;

    private BeanRealImpl beanRealImpl;

    public BeanProxyImpl(String value) {
        this.value = value;
    }

    @Override
    public void doing() {
        if (beanRealImpl == null) {
            beanRealImpl = new BeanRealImpl(value);
        }
        beanRealImpl.doing();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
