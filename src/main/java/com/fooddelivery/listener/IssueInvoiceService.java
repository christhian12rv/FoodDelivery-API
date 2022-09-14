package com.fooddelivery.listener;

import com.fooddelivery.di.service.ActivatedClientEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class IssueInvoiceService {
    @EventListener
    public void activatedClientListener(ActivatedClientEvent event) {
        System.out.println("Emitindo nota fiscal para cliente " + event.getClient().getName());
    }
}
