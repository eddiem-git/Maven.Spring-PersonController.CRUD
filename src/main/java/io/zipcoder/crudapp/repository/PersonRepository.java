package io.zipcoder.crudapp.repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.zipcoder.crudapp.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
