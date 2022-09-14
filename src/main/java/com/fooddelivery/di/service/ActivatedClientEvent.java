package com.fooddelivery.di.service;

import com.fooddelivery.di.model.Client;

public class ActivatedClientEvent {
    private Client client;

    public ActivatedClientEvent(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
