package com.pipi.gof.filter;

import java.util.List;
import java.util.stream.Collectors;

public class BeanFilter2 implements IFilter<Bean> {

    @Override
    public List<Bean> filter(List<Bean> list) {
        return list.stream().filter(bean -> bean.getName().endsWith("2")).collect(Collectors.toList());
    }

}
