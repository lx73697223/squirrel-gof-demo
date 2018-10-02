package com.pipi.gof.proxy;

/**
 维持一个引用，使得代理可以访问Subject。
 提供一个与Subject的接口相同的接口，这样代理就可以替代Subject。
 控制对Subject的访问，并可能负责对Subject的创建和删除。
 */
public class ProxyImpl implements Subject {

    private String value;

    private SubjectImpl subject;

    public ProxyImpl(String value) {
        this.value = value;
    }

    @Override
    public void doing() {
        if (subject == null) {
            subject = new SubjectImpl(value);
        }
        subject.doing();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
