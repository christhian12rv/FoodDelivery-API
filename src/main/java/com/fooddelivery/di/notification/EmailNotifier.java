package com.fooddelivery.di.notification;

import com.fooddelivery.di.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@NotifierType(UrgencyLevel.URGENCY)
@Component
public class EmailNotifier implements Notifier {
    @Autowired
    private NotifierProperties properties;

    public EmailNotifier() {
        System.out.println("EmailNotifier REAL");
    }

    @Override
    public void notify(Client client, String message) {
        System.out.println("Host: " + properties.getServerHost());
        System.out.println("Porta: " + properties.getServerPort());

        System.out.printf("Notificando %s através do email %s: %s", client.getName(),
                client.getEmail(), message);
    }
}


