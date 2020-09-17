package com.company.dao;

import com.company.models.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(1,"Petr"));
        people.add(new Person(2,"Alex"));
        people.add(new Person(3,"Victor"));
        people.add(new Person(3,"Katy"));
    }

    public List<Person> index () {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(x->x.getId() == id).findAny().orElse(null);
    }
}
