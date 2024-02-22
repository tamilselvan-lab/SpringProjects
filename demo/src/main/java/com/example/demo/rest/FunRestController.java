package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayWorld(){
        return "Hello world!";
    }

    @GetMapping("/teamName")
    public String teamName(){
        return teamName;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFoutune() {
        return "Today is  your lucky day.";
    }
}

