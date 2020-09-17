package com.company.dao;

import com.company.models.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private int ID_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++ID_COUNT,"Petr"));
        people.add(new Person(++ID_COUNT,"Alex"));
        people.add(new Person(++ID_COUNT,"Victor"));
        people.add(new Person(++ID_COUNT,"Katy"));
    }

    public List<Person> index () {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(x->x.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++ID_COUNT);
        people.add(person);
    }
}
