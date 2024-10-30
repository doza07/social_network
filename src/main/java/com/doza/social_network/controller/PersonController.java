package com.doza.social_network.controller;

import com.doza.social_network.model.Person;
import com.doza.social_network.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/findPerson/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.findPersonById(id);
    }

    @PostMapping("/save")
    public Person savePerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @PostMapping("/update/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person person) {
        return personService.update(person);
    }

    @GetMapping("/delete/{id}")
    public void deletePersonById(@PathVariable Long id) {
        personService.deletePersonById(id);
    }
}
