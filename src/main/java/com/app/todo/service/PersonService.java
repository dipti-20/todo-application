package com.app.todo.service;

import com.app.todo.dao.PersonDao;
import com.app.todo.model.Person;

public class PersonService {
    PersonDao personDao;
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }
    public void addPerson(Person person){
        personDao.addPerson(person);
    }
}
