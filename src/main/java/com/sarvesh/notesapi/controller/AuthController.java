package com.sarvesh.notesapi.controller;

import com.sarvesh.notesapi.entity.User;
import com.sarvesh.notesapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired private UserService userService;

    static class AuthRequest {
        public String username;
        public String password;
    }

    @PostMapping("/register")
    public User register(@RequestBody AuthRequest request) {
        return userService.registerUser(request.username, request.password);
    }

    @GetMapping("/ping")
    public String ping() {
        return "Auth API working!";
    }
}
