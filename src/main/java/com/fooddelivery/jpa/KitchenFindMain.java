package com.fooddelivery.jpa;

import com.fooddelivery.FoodDeliveryApiApplication;
import com.fooddelivery.domain.model.Kitchen;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class KitchenFindMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(FoodDeliveryApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        KitchenRegister kitchenRegister = applicationContext.getBean(KitchenRegister.class);

        List<Kitchen> kitchens = kitchenRegister.findAll();

        for (Kitchen kitchen: kitchens) {
            System.out.println(kitchen.getName());
        }


        Long id = 1L;
        Kitchen kitchenById = kitchenRegister.findById(id);
        System.out.printf("Cozinha com id %d - %s\n", id, kitchenById.getName());

    }
}
