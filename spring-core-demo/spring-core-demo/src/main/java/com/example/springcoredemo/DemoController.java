package com.example.springcoredemo;

import com.example.springcoredemo.component.intetrface.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{

    private Coach myCoach;

    @Autowired
    public DemoController(Coach theCoach){
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return this.myCoach.getDailyworkout();
    }
}
