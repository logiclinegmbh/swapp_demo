package de.logicline.swapp.model;


/**
 * 
 * The person Entity.
 * Represents the Table "Person" in the Database
 * 
 * @author logicline
 *
 */
public class Person {

    private Integer id;

    private String firstName;

    private String lastName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
