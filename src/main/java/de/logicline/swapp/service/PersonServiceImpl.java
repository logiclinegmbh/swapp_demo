package de.logicline.swapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import de.logicline.swapp.model.Person;

/**
 * 
 * Spring Bean Implementation of the {@link PersonService}
 * Gets the Hibernate EntityManager injected to do the ORM magic.
 * You might consider to create an DAO (Data Access Object) Layer in order 
 * to separate business logic (usually located in the Service Components) from 
 * persistence logic.
 * 
 * (The M in MVC)
 * 
 * @author logicline
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	List<Person> memDB = new ArrayList<Person>();
	
    public void addPerson(Person person) {
    	memDB.add(person);
    }

    public List<Person> listPeople() {
    	return memDB;
    }

    public void removePerson(Integer id) {
    	memDB.remove(id);
    }
    
}
