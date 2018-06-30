package pl.mtwa.parent_children.application;

import pl.mtwa.parent_children.config.Configuration;
import pl.mtwa.parent_children.dao.PersonDao;
import pl.mtwa.parent_children.dao.PersonDaoImpl;
import pl.mtwa.parent_children.model.AdultOrChildren;
import pl.mtwa.parent_children.model.Person;
import pl.mtwa.parent_children.service.PersonService;
import pl.mtwa.parent_children.service.PersonServiceImpl;
import pl.mtwa.parent_children.service.WelcomeService;

import java.sql.Connection;

public class Application {

    public static void main(String[] args) {


        Connection dbConnection = Configuration.getInstance().getDbConnection();
        PersonDao databaseDao = new PersonDaoImpl(dbConnection);
        PersonService personService = new PersonServiceImpl(databaseDao);

        WelcomeService welcomeService = new WelcomeService(WelcomeService.EN_LANG);
        welcomeService.sayHello();


        Person peszko = new Person("Sławek", "Peszko", 45, AdultOrChildren.ADULT);
        Person peszkowa = new Person("Helena", "Perszko", 18, AdultOrChildren.ADULT);

        Person robert = new Person("Robert", "L", 30, AdultOrChildren.ADULT);
        Person ania = new Person("Ania", "L", 30, AdultOrChildren.ADULT);

        Person klara = new Person("Klara", "L", 1,AdultOrChildren.CHILD);
        Person jurek = new Person("Jurek", "L", 0, AdultOrChildren.CHILD);

        robert.addChild(klara);
        ania.addChild(klara);
        robert.addChild(jurek);
        ania.addChild(jurek);

        System.out.println("saveing person to db");
        personService.savePerson(peszko);
        personService.savePerson(peszkowa);
        personService.savePerson(robert);
        personService.savePerson(ania);

        System.out.println("reading persons from db");
        System.out.println(personService.getAllPersons());




    }
}
