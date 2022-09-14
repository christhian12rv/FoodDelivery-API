package com.fooddelivery.di.notification;

import com.fooddelivery.di.model.Client;
import org.springframework.stereotype.Component;

@NotifierType(UrgencyLevel.NO_URGENCY)
@Component
public class SMSNotifier implements Notifier{
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s", client.getName(),
                client.getPhone(), message);
    }
}
