package com.app.todo.dao;

import com.app.todo.model.Person;

import java.util.UUID;

public class PersonDaoImplimentation implements PersonDao{

    @Override
    public int insertPerson(UUID uuid, Person person) {
        return 1;
    }

    @Override
    public void addPerson(Person person) {
            UUID uuid=UUID.randomUUID();
            insertPerson(uuid,person);
    }
}
