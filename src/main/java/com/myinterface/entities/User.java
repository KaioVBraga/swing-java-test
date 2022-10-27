package com.myinterface.entities;

public class User extends Auditable {
   public String name;
   public String userName;
   public String email;
   public String password;

   public User(String name, String userName, String email, String password) {
      this.name = name;
      this.userName = userName;
      this.email = email;
      this.password = password;
   }
}