package com.example.login.model;

public class User {
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String name){
        username = name;
    }

    public void setPassword(String pass){
        password = pass;
    }
}
