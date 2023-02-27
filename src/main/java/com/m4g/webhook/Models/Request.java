package com.m4g.webhook.Models;

public class Request {
    private String object;
    private Entry[] entry;

    public Request(String object, Entry[] entry) {
        this.object = object;
        this.entry = entry;
    }

    public String getObject() {
        return object;
    }

    public Entry[] getEntry() {
        return entry;
    }
}
