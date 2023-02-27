package com.m4g.webhook.Models;

public class Entry {
    private String id;
    private Changes[] changes;

    public Entry(String id, Changes[] changes) {
        this.id = id;
        this.changes = changes;
    }

    public String getId() {
        return id;
    }

    public Changes[] getChanges() {
        return changes;
    }
}
