package com.pipi.gof.builder;

import java.util.Map;

public class Bean {

    private String value;

    private Map<String, String> values;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }
}
