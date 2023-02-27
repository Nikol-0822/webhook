package com.m4g.webhook.Models;

public class Contacts {
    private Profile profile;
    private String wa_id;

    public Contacts(Profile profile, String wa_id) {
        this.profile = profile;
        this.wa_id = wa_id;
    }

    public Profile getProfile() {
        return profile;
    }

    public String getWa_id() {
        return wa_id;
    }
}
