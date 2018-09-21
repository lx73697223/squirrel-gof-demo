package com.pipi.gof.filter;

import java.util.List;

public class FilterChain<T> {

    private List<IFilter<T>> filters;

    public FilterChain(List<IFilter<T>> filters) {
        this.filters = filters;
    }

    public List<T> filter(List<T> list) {
        for (IFilter<T> filter : filters) {
            list = filter.filter(list);
        }
        return list;
    }

}
