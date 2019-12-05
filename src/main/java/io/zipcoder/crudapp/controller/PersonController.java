package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PersonController {

    @GetMapping
    public Person createPerson(Person p){
        return null;
    }
    @GetMapping
    public Person getPerson(int id){
        return null;
    }

    public List<Person> getPersonList(){
        return null;
    }

    public Person updatePerson(Person p){
        return null;
    }


    public void DeletePerson(int id){

    }

}
