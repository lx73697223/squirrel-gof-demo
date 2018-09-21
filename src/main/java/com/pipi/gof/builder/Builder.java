package com.pipi.gof.builder;

import java.util.HashMap;
import java.util.Map;

public class Builder {

    private String value;

    private Map<String, String> values = new HashMap<>();

    private Builder(String value) {
        this.value = value;
    }

    public static Builder newBuilder(String value) {
        return new Builder(value);
    }

    public Builder addValue(String key, String value) {
        this.values.put(key, value);
        return this;
    }

    public Bean build() {
        Bean bean = new Bean();
        bean.setValue(value);
        bean.setValues(values);
        return bean;
    }

}
