package com.pipi.gof.filter;

import java.util.List;
import java.util.stream.Collectors;

public class BeanFilter3 implements IFilter<Bean> {

    @Override
    public List<Bean> filter(List<Bean> list) {
        return list.stream().filter(bean -> bean.getValue().length() <= 5)
                   .collect(Collectors.toList());
    }

}
