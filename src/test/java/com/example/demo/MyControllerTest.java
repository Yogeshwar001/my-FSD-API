package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(myController.class)  // Only the myController will be loaded in the test context
public class MyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Test the /api/hello endpoint
    @Test
    public void testSayHello() throws Exception {
        mockMvc.perform(get("/api/hello")) // Perform a GET request to /api/hello
                .andExpect(status().isOk())  // Expect HTTP 200 OK status
                .andExpect(content().string(containsString("\"Tejas\"")));  // Expect response to contain "Tejas"
    }

    // Test the /api/{name} endpoint with a path variable
    @Test
    public void testGreetUser() throws Exception {
        String name = "John";  // Path variable to be passed to the URL
        mockMvc.perform(get("/api/{name}", name))  // Send a GET request to /api/John
                .andExpect(status().isOk())  // Expect HTTP 200 OK status
                .andExpect(content().string(containsString("\"Hello, " + name + "!\"")));  // Check response content
    }
}
