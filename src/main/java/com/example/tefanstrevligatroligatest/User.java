package com.example.tefanstrevligatroligatest;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }



    public boolean UsernameIsSame(User otherUser){
        if (this.username == otherUser.username){
            return true;
        }else {
            return false;
        }
    }
}
