package com.codein.store;

import com.codein.store.entities.Profile;
import com.codein.store.entities.User;
import com.codein.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var repository = context.getBean(UserRepository.class);
        repository.deleteById(2L);


//        var user = User.builder()
//                .name("John")
//                .email("john@email.com")
//                .password("password")
//                .build();
//        repository.save(user);
//        var orderService= context.getBean(OrderService.class);
//        var orderService2= context.getBean(OrderService.class);
//        var resource = context.getBean(HeavyResource.class);
//        orderService.placeOrder();

//        var userService = context.getBean(UserService.class);
//        userService.registerUser(new User(1099L,"kk@plaza.com","12345","KK"));
//        userService.registerUser(new User(1099L,"kk@plaza.com","12345","KK"));

//        var user = User.builder()
//                .name("John")
//                .password("Password")
//                .email("john@email.com")
//                .build();



//           var profile = Profile.builder()
//                           .bio("bio")
//                           .build();
//
//        user.setProfile(profile);
//        profile.setUser(user);
//
//        System.out.println(user);
//


       // context.close();
    }

}
