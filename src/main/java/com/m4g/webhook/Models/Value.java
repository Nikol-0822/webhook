package com.m4g.webhook.Models;

public class Value {
    private String messagingProduct;
    private Metadata metadata;
    private Contacts[] contacts;
    private Messages[] messages;

    public Value(String messagingProduct, Metadata metadata, Contacts[] contacts, Messages[] messages) {
        this.messagingProduct = messagingProduct;
        this.metadata = metadata;
        this.contacts = contacts;
        this.messages = messages;
    }

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Contacts[] getContacts() {
        return contacts;
    }

    public Messages[] getMessages() {
        return messages;
    }
}
