package com.example.Conferencespring.service;

import com.example.Conferencespring.model.GreetingModel;
import com.example.Conferencespring.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;
    private List<GreetingModel> greetingmodel =
            new ArrayList<>(Arrays.asList(new GreetingModel("saravanan","nallakamu",27,"8"),
                    new GreetingModel("mohan","g",27,"2"),
                    new GreetingModel("Sudhakar","r",27,"3")));

    public List<GreetingModel> getAll(){
        List<GreetingModel> ll = new ArrayList<>();
        greetingRepository.findAll().forEach(ll::add);
        return ll;
    }

    public void addTopic(GreetingModel greetingModel) {
        //greetingmodel.add(greetingModel);
        greetingRepository.save(greetingModel);
    }

    public long getCount() {
        return greetingRepository.count();
    }
}
