package com.fooddelivery;

import com.fooddelivery.di.model.Client;
import com.fooddelivery.di.service.ClientActivationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {
    private ClientActivationService clientActivationService;

    public MyFirstController(ClientActivationService clientActivationService) {
        this.clientActivationService = clientActivationService;

        System.out.println("MyFirstController: " + clientActivationService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Client joao = new Client("João", "joao.@xyz.com", "3499998888");
        clientActivationService.activate(joao);
        return "Hello!";
    }
}
