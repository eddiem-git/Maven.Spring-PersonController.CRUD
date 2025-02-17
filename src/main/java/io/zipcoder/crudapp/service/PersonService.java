package io.zipcoder.crudapp.service;

import io.zipcoder.crudapp.model.Person;
import io.zipcoder.crudapp.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository repository;

    public PersonService(PersonRepository repository){
        this.repository = repository;
    }

    public Iterable<Person> index(){
        return repository.findAll();
    }

    public Person show(Long id) {
        return repository.findOne(id);
    }

    public Person create(Person person){
        return repository.save(person);
    }

    public Person update(Long id, Person newPersonData){
        Person originalPerson = repository.findOne(id);
        originalPerson.setFirstName(newPersonData.getFirstName());
        originalPerson.setLastName(newPersonData.getLastName());
        return repository.save(originalPerson);
    }

    public Boolean delete(Long id){
        repository.delete(id);
        return true;
    }
}
