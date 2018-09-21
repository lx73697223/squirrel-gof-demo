package com.pipi.gof.filter;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class FilterPatternDemo {

    public static void main(String[] args) {
        List<Bean> list = Lists.newArrayList(new Bean(1L, "A1", "AA"),
                                             new Bean(5L, "B2", "555"),
                                             new Bean(10L, "C3", "==10LA3=="));

        List<IFilter<Bean>> filters = Lists.newArrayList(new BeanFilter1(),
                                                         new BeanFilter2(),
                                                         new BeanFilter3());

        FilterChain<Bean> filterChain = new FilterChain<>(filters);
        List<Bean> meetList = filterChain.filter(list);

        System.out.println("list = " + list.stream().map(Bean::getName).collect(Collectors.joining(" ")));

        System.out.println("meetList = " + meetList.stream().map(Bean::getName).collect(Collectors.joining(" ")));
    }

}
