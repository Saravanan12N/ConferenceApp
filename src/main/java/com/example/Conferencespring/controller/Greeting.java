package com.example.Conferencespring.controller;

import com.example.Conferencespring.model.GreetingModel;
import org.springframework.boot.web.server.GracefulShutdownResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class Greeting {
    @GetMapping("/greeting")
    public GreetingModel greeting(GreetingModel greetingModel){

        greetingModel.setAge(27);
        greetingModel.setFirstname("Saravanan");
        greetingModel.setLastname("Nallakamu");
        return greetingModel;
    }
}
