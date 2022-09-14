package com.fooddelivery.listener;

import com.fooddelivery.di.notification.Notifier;
import com.fooddelivery.di.notification.NotifierType;
import com.fooddelivery.di.notification.UrgencyLevel;
import com.fooddelivery.di.service.ActivatedClientEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotifierService {
    @NotifierType(UrgencyLevel.URGENCY)
    @Autowired
    private Notifier notifier;

    @EventListener
    public void activatedClientListener(ActivatedClientEvent event) {
        notifier.notify(event.getClient(), "Seu cadastro no sistema está ativo!");
    }
}
