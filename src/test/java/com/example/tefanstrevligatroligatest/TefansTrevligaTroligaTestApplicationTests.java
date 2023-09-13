package com.example.tefanstrevligatroligatest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
class TefansTrevligaTroligaTestApplicationTests {


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

}
