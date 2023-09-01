package com.example.Conferencespring.controller;
import com.example.Conferencespring.model.GreetingModel;
import com.example.Conferencespring.service.GreetingService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.GracefulShutdownResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class Greeting {
    @Autowired
    private GreetingService greetingService;
    @GetMapping("/greeting")
    public List<GreetingModel> greeting(){
        return greetingService.getAll();

    }
}
