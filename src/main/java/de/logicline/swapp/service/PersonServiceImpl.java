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

    private List<Person> memDB = new ArrayList<Person>();
    private int lastId = 0;
    
	public void addPerson(Person person) {
		System.out.println("add person with id: " + lastId);
		person.setId(lastId++);
		memDB.add(person);
    }

    public List<Person> listPeople() {
    	System.out.println("load persons");
        return memDB ;
    }

    public void removePerson(Integer id) {
		System.out.println("remove person with id: " + id);
		
		for (Person person : memDB) {
			if (person.getId()==id) {
				memDB.remove(person);
				break;
			}
		}
    }
    
}
