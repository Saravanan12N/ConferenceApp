package com.example.Conferencespring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GreetingModel {

    @Id
    private String firstname;
    private String lastname;
    private int age;

    public GreetingModel() {
    }

    public GreetingModel(String firstname, String lastname, int age, String experience) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        Experience = experience;
    }

    private String Experience;


    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
