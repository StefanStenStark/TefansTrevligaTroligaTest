package com.example.tefanstrevligatroligatest;

public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public boolean Login(String username, String password){
        User user = userRepo.findUserByUsername(username).orElseThrow();

        if (password != null){
            if (user.getPassword() == password){
                return true;
            }else {
                return false;
            }
        }else {
            throw new RuntimeException("No password");
        }
    }


}
