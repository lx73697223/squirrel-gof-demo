package com.pipi.gof.filter;

import java.util.List;
import java.util.stream.Collectors;

public class BeanFilter1 implements IFilter<Bean> {

    @Override
    public List<Bean> filter(List<Bean> list) {
        return list.stream().filter(bean -> bean.getId() < 10).collect(Collectors.toList());
    }

}
