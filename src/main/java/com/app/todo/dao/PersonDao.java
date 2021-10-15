package com.app.todo.dao;

import com.app.todo.model.Person;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID uuid, Person person);
    void addPerson(Person person);
}
