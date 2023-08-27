package com.example.Conferencespring.controller;
import com.example.Conferencespring.model.GreetingModel;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.web.server.GracefulShutdownResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class Greeting {
    @GetMapping("/greeting")
    public GreetingModel greeting(@NotNull GreetingModel greetingModel){
        greetingModel.setAge(27);
        greetingModel.setFirstname("Saravanan");
        greetingModel.setLastname("Nallakamu");
        greetingModel.setExperience("6 Years");
        return greetingModel;
    }
}
