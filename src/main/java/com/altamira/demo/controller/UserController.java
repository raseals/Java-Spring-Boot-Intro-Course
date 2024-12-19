package com.altamira.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController
{
    @GetMapping("/users")
    public List<String> getUsers()
    {
        return List.of("Iron Man", "Captain America", "Thor", "Hulk", "Hawkeye", "Deadpool");
    }
}
