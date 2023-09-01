package com.example.Conferencespring.service;

import com.example.Conferencespring.model.GreetingModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class GreetingService {
    private List<GreetingModel> greetingmodel =
            new ArrayList<>(Arrays.asList(new GreetingModel("saravanan","nallakamu",27,"8"),
                    new GreetingModel("mohan","g",27,"2"),
                    new GreetingModel("Sudhakar","r",27,"3")));

    public List<GreetingModel> getAll(){
        return greetingmodel;
    }

    public void addTopic(GreetingModel greetingModel) {
        greetingmodel.add(greetingModel);
    }
}
