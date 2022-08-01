package com.example.team.gd.SpringBootDemo.services;

import com.example.team.gd.SpringBootDemo.model.person.Person;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Map;

@RestController("personController")
@RequestMapping("/person")
public class PersonService {
    private Map<Integer, Person> personMap;

    @Resource(name = "person") // Bean found in PersonConfig
    public void setPersonMap(Map<Integer, Person>personMap) {
        this.personMap = PersonService.this.personMap;
    }

    /**
     * Standard GET all Request
     * @return Map
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Collection<Person> getAll() {
        return PersonService.this.personMap.values();
    }

    /**
     * Standard PUT Request
     * @return Person - newPerson
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public Person putRequest(@RequestBody Person newPerson) {

        PersonService.this.personMap.put(newPerson.getId(), newPerson);

        return newPerson;
    }

    /**
     * Standard GET by ID Request
     * @return Person - newPerson
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Person getById(@PathVariable("id") Integer id) {
        return PersonService.this.personMap.get(id); }
}
