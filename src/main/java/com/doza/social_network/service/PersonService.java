package com.doza.social_network.service;

import com.doza.social_network.model.Person;
import com.doza.social_network.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        log.info("Get all persons");
        return personRepository.findAll();
    }

    public Person findPersonById(Long id) {
        log.info("Get person by id: {}", id);
        return personRepository.findById(id).orElse(null);
    }

    public Person save(Person person) {
        log.info("Save person, {}", person.toString());
        return personRepository.save(person);
    }

    public Person update(Person person) {
        log.info("Update person, {}", person.toString());
        return personRepository.save(person);
    }

    public void deletePersonById(Long id) {
        log.info("Delete person by id: {}", id);
        personRepository.deleteById(id);
    }
}
