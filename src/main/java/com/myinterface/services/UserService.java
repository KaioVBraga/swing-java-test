package com.myinterface.services;

import com.myinterface.entities.User;
import com.myinterface.models.UserModel;

public class UserService {

    public static void create(User user) {
        System.out.println("UserService::create -> " + user);

        UserModel.create(user);
    }

}
