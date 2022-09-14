package com.fooddelivery.di.service;

import com.fooddelivery.di.model.Client;
import com.fooddelivery.di.notification.Notifier;
import com.fooddelivery.di.notification.NotifierType;
import com.fooddelivery.di.notification.UrgencyLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClientActivationService {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @NotifierType(UrgencyLevel.URGENCY)
    @Autowired
    private Notifier notifier;

    public void activate(Client client) {
        client.activate();
        eventPublisher.publishEvent(new ActivatedClientEvent(client));
    }
}
