package com.example.springcoredemo.component;

import com.example.springcoredemo.component.intetrface.Coach;
import org.springframework.stereotype.Component;

@Component
class CricketCoach implements Coach {

    @Override
    public String getDailyworkout() {
        return "Daily workout!";
    }
}