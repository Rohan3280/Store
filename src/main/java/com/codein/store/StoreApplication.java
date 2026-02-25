package com.codein.store;

import com.codein.store.entities.Address;
import com.codein.store.entities.Profile;
import com.codein.store.entities.Tag;
import com.codein.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

       // ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var orderService= context.getBean(OrderService.class);
//        var orderService2= context.getBean(OrderService.class);
//        var resource = context.getBean(HeavyResource.class);
//        orderService.placeOrder();

//        var userService = context.getBean(UserService.class);
//        userService.registerUser(new User(1099L,"kk@plaza.com","12345","KK"));
//        userService.registerUser(new User(1099L,"kk@plaza.com","12345","KK"));

        var user = User.builder()
                .name("John")
                .password("Password")
                .email("john@email.com")
                .build();



           var profile = Profile.builder()
                           .bio("bio")
                           .build();

        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);



       // context.close();
    }

}
