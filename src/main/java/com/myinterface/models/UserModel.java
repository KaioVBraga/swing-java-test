package com.myinterface.models;

import java.util.List;

import com.myinterface.entities.User;
import com.myinterface.utils.JsonManager;

public class UserModel {
    static JsonManager<User> jsonManager = new JsonManager<User>("mockdatabase/users.json");

    public static void create(User user) {
        System.out.println("UserModel::create -> " + user);

        List<User> users = jsonManager.findAll();

        user.id = Long.valueOf(users.size() + 1);

        jsonManager.insert(user);
    }

    public static User findOne(Long id) {
        System.out.println("UserModel::findOne -> " + id);

        User user = jsonManager.findOne(id);

        System.out.println("USER -> " + user);

        return user;
    }

}
