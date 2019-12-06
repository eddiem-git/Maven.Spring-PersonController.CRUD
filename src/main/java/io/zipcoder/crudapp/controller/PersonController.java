package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.model.Person;
import io.zipcoder.crudapp.repository.PersonRepository;
import io.zipcoder.crudapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PersonController {
    private PersonService service;
    private PersonRepository personRepository;
    @Autowired
    public PersonController(PersonService service){
        this.service = service;
    }
    @PostMapping("/people")
    public ResponseEntity<Person> createPerson(@RequestBody Person p){
        return null;
    }
    @GetMapping("/people/{id}")
    public ResponseEntity<Person> showPerson(@PathVariable Long id){
        return null;
    }
    @GetMapping("/people")
    public ResponseEntity<Iterable<Person>> indexPersonList(){
        return null;
    }
    @PutMapping("/people/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person p, @PathVariable Long id){
        return null;
    }
    @DeleteMapping("/people/{id}")
    public ResponseEntity<Boolean> DeletePerson(@PathVariable Long id){
    return null;
    }

}
