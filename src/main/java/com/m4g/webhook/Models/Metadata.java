package com.m4g.webhook.Models;

public class Metadata {
    private String displayPhoneNumber;
    private String phoneNumberId;

    public Metadata(String displayPhoneNumber, String phoneNumberId) {
        this.displayPhoneNumber = displayPhoneNumber;
        this.phoneNumberId = phoneNumberId;
    }

    public String getDisplayPhoneNumber() {
        return displayPhoneNumber;
    }

    public String getPhoneNumberId() {
        return phoneNumberId;
    }
}
