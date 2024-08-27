package com.velocity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping("/test")
    public String test() {
        return "Test successful";
    }

	@GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
