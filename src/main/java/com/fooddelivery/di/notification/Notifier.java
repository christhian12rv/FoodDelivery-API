package com.fooddelivery.di.notification;

import com.fooddelivery.di.model.Client;

public interface Notifier {
    void notify(Client client, String message);
}
