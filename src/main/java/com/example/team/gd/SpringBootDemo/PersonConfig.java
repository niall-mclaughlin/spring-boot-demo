package com.example.team.gd.SpringBootDemo;

import com.example.team.gd.SpringBootDemo.model.person.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class PersonConfig {
    @Bean(name = "person")
    @Scope("prototype")
    public Map<Integer, Person> buildPersonMap() throws Exception {
        HashMap<Integer, Person>personMap = new HashMap<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Here is where you will create sample data
        Person person1 = new Person(1, "John Smith", dateFormat.parse("2019-01-17"), "john.smith@email.com");
        Person person2 = new Person(2, "John Smith", dateFormat.parse("2019-01-17"), "john.smith@email.com");

        // Add data to Map
        addPersonToMap(person1, personMap);
        addPersonToMap(person2, personMap);


        return personMap;
    }

    private void addPersonToMap(Person person, Map<Integer, Person> personMap) {
        personMap.put(person.getId(), person);
    }
}
