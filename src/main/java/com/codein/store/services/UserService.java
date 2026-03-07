package com.codein.store.services;
import com.codein.store.repositories.ProfileRepository;
import com.codein.store.repositories.UserRepository;

import com.codein.store.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityStates(){
        var user = User.builder()
                .name("John Doe")
                .email("john.doe@")
                .password("password")
                .build();

        if(entityManager.contains(user))
            System.out.println("Persistent");
        else
            System.out.println("Transient / Detached");

        userRepository.save(user);


        if(entityManager.contains(user))
            System.out.println("Persistent");
        else
            System.out.println("Transient / Detached");
    }

    public void showRelatedEntites(){
        var profile=profileRepository.findById(3L).orElseThrow();
        System.out.println(profile.getBio());
    }
}
