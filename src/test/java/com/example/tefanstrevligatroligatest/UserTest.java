package com.example.tefanstrevligatroligatest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void can_get_username_with_getter() {
        //Given
        String username = "Tefis";
        String password = "TefisIsBestis";
        User user = new User(username, password);

        //When
        String getUsername = user.getUsername();

        //Then
        assertEquals(getUsername, username);

    }
    @Test
    void can_get_password_with_getter() {
        //Given
        String username = "Tefis";
        String password = "TefisIsBestis";
        User user = new User(username, password);

        //When
        String getPassword = user.getPassword();

        //Then
        assertEquals(getPassword, password);

    }

    @Test
    void user_with_same_name_is_same() {
        //Given
        String username = "Tefis";
        String password = "TefisIsBestis";
        User user1 = new User(username, password);
        User user2 = new User(username, password);

        //When
        boolean isItSame = user1.UsernameIsSame(user2);

        //Then
        assertTrue(isItSame);

    }

    @Test
    void userConstructor_create_name_and_password_success() {
        //Given
        String username = "Tefis";
        String password = "TefisIsBestis";


        //When
        User user = new User(username, password);

        //Then
        assertNull(user);

    }

}
