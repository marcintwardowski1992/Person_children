package pl.mtwa.parent_children.service;

import pl.mtwa.parent_children.model.Person;

import java.util.List;

public interface PersonService {

    boolean savePerson (Person person);
    boolean deletePerson(Person person);
    boolean updatePerson(Person person);
    List<Person> getAllPersons();
    List<Person> getPersonsWithoutChildren();
    List<Person> getOnlyPersonsWithChildren();

}
