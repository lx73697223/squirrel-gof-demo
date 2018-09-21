package com.pipi.gof.filter;

import java.util.List;

public interface IFilter<T> {

    List<T> filter(List<T> list);

}
