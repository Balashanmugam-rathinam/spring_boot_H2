package com.securepay.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Dummy logic for example
        if ("admin".equals(username) && "1234".equals(password)) {
            return "Login successful!";
        } else {
            return "Invalid credentials.";
        }
    }
}
