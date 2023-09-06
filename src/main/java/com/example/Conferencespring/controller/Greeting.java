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


    @PostMapping("/greeting")
    public String addTopic(@RequestBody GreetingModel greetingModel){
        greetingService.addTopic(greetingModel);
        return "Added new record";
    }

    @GetMapping("/countgreeting")
    public long getCount(){
        return greetingService.getCount();
    }

    @GetMapping("/")
    public String home(){
        return ("<h1> Logged in SuccessFully </h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1> Welcome admin</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1> Welcome user</h1>");
    }

}
