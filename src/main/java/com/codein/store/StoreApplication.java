package com.codein.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var orderService= context.getBean(OrderService.class);
//        var orderService2= context.getBean(OrderService.class);
//        var resource = context.getBean(HeavyResource.class);
//        orderService.placeOrder();

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L,"kk@plaza.com","12345"));
        userService.registerUser(new User(1L,"kk@plaza.com","12345"));

        context.close();
    }

}
