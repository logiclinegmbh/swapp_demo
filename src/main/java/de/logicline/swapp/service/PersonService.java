package de.logicline.swapp.service;


import java.util.List;

import de.logicline.swapp.model.Person;

public interface PersonService {
    
    public void addPerson(Person person);
    public List<Person> listPeople();
    public void removePerson(Integer id);
}
