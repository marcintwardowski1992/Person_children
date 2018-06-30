package pl.mtwa.parent_children.dao;

import pl.mtwa.parent_children.model.Person;

import java.sql.Connection;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    private Connection dbConnetion;

    public PersonDaoImpl (Connection dbConnetion){
        this.dbConnetion = dbConnetion;
    }

    @Override
    public boolean savePerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(Person person) {
        return false;
    }

    @Override
    public boolean updatePerson(Person person) {
        return false;
    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }
}
