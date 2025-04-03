package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class) // Test only the UserController
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testGetUsers() throws Exception {
        mockMvc.perform(get("/api/users")) // Send a GET request to /api/users
                .andExpect(status().isOk()) // Expect HTTP 200 OK status
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // Expect JSON content type
                .andExpect(jsonPath("$", hasSize(4))) // Expect 4 users in the response
                .andExpect(jsonPath("$[0].name", is("Ram"))) // Check the first user's name
                .andExpect(jsonPath("$[1].name", is("manoj"))) // Check the second user's name
                .andExpect(jsonPath("$[2].name", is("Ashok"))) // Check the third user's name
                .andExpect(jsonPath("$[3].name", is("Sanju"))); // Check the fourth user's name
    }
}
