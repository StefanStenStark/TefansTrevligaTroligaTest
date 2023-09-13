package com.example.tefanstrevligatroligatest;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ServiceTest {

    @Test
    public void test_login(){
        //Given
        User user = new User(username, password);

        //When
        when(userRepo.findUserByUsername(username)).thenReturn(Optional.of(user));


        //Then
        assertTrue((userService.login(username, password)));
    }
}
