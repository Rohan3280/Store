package com.codein.store.services;

import com.codein.store.entities.User;

public class UserService {
    public void showEntityStates(){
        var user = User.builder()
                .name("John Doe")
                .email("john.doe@")
    }
}
