package com.m4g.webhook.Models;

public class Messages {
    private String from;
    private String id;
    private String timestamp;
    private Text text;
    private String type;

    public Messages(String from, String id, String timestamp, Text text, String type) {
        this.from = from;
        this.id = id;
        this.timestamp = timestamp;
        this.text = text;
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public String getId() {
        return id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Text getText() {
        return text;
    }

    public String getType() {
        return type;
    }
}
