package com.myinterface.models;

import com.myinterface.entities.User;
import com.myinterface.utils.JsonManager;

public class UserModel {
    static JsonManager<User> jsonManager = new JsonManager<User>("mockdatabase/users.json");

    public static void create(User user) {
        System.out.println("UserModel::create -> " + user);

        jsonManager.create(user);
    }

}
