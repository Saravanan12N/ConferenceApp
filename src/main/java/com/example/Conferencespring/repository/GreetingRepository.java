package com.example.Conferencespring.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.Conferencespring.model.GreetingModel;

public interface GreetingRepository extends CrudRepository<GreetingModel,String> {

}
