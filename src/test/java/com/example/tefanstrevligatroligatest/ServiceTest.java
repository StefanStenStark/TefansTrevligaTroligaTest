package com.example.tefanstrevligatroligatest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @Mock
    UserRepo userRepo;

    private UserService userService;

    @BeforeEach
    public void setUp(){
        userService = new UserService(userRepo);
    }

    @Test
    public void test_login(){
        //Given
        String username = "Tefis";
        String password = "TefisIsBestis";
        User user = new User(username, password);

        //When
        when(userRepo.findUserByUsername(username)).thenReturn(Optional.of(user));


        //Then
        assertTrue((userService.Login(username, password)));
    }


    @Test
    public void testLoginFailureNoUserTrowNoSuchElementException() {

        //Then
        assertThrows(NoSuchElementException.class, () -> {
            userService.Login("Tefis","NoNoNoNo");
        });
    }

    @Test
    public void testNullPasswordShouldReturnRuntimeException() {
        //Given
        String username = "Tefis";
        String password = "TefisIsBestis";
        User user = new User(username, password);

        //When
        when(userRepo.findUserByUsername(username)).thenReturn(Optional.of(user));

        //Then
        assertThrows(RuntimeException.class, () -> {
            userService.Login(username, null);
        });
    }
}
