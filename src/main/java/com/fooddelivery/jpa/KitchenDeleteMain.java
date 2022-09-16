package com.fooddelivery.jpa;

import com.fooddelivery.FoodDeliveryApiApplication;
import com.fooddelivery.domain.model.Kitchen;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class KitchenDeleteMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(FoodDeliveryApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        KitchenRegister kitchenRegister = applicationContext.getBean(KitchenRegister.class);

        Kitchen kitchen = new Kitchen();
        kitchen.setId(1L);

        kitchenRegister.delete(kitchen);
    }
}
