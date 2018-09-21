package com.pipi.gof.composite;

import com.google.common.collect.Lists;

import java.util.List;

public class CompositeBean {

    private Long id;

    private String value;

    private int type;

    private List<CompositeBean> subBeans;

    public CompositeBean(Long id, String value, int type) {
        this.id = id;
        this.value = value;
        this.type = type;
        this.subBeans = Lists.newArrayList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<CompositeBean> getSubBeans() {
        return subBeans;
    }

    public CompositeBean addSubBeans(List<CompositeBean> subBeans) {
        this.subBeans.addAll(subBeans);
        return this;
    }

    public CompositeBean addSubBean(CompositeBean subBean) {
        this.subBeans.add(subBean);
        return this;
    }

    public CompositeBean removeSubBean(CompositeBean subBean) {
        this.subBeans.remove(subBean);
        return this;
    }
}
