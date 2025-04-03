package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

	@GetMapping("/api/users")
	 public List<User> getUsers() {
	List<User> users = new ArrayList<>();
	users.add(new User("Ram",20,"hyd",201000));
	users.add(new User("manoj",30,"blr",120000));
	users.add(new User("Ashok",40,"pune",230000));
	users.add(new User("Sanju",50,"pun",220000));
	
	return users;
	}
}
