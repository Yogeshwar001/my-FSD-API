package com.example.demo;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class myController {

	@GetMapping("/api/hello")
	public String sayHello() {
		return "\"Tejas\"";
	}
	
	   // A GET request with a path variable
    @GetMapping("/api/{name}")
    public String greetUser(@PathVariable String name) {
        return "\"Hello, " + name + "!\"";
    }

}
