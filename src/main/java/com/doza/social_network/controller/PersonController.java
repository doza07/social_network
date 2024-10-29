package com.doza.social_network.controller;

import com.doza.social_network.generator.GeneratorPerson;
import com.doza.social_network.model.Person;
import com.doza.social_network.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/getAllPersons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/generatePersons")
    public void generatePersons() {
        generatorPerson.createMillionUsers();
    }
}
