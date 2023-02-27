package com.m4g.webhook.Models;

public class Changes {
    private Value value;
    private String field;

    public Changes(Value value, String field) {
        this.value = value;
        this.field = field;
    }

    public Value getValue() {
        return value;
    }

    public String getField() {
        return field;
    }
}
