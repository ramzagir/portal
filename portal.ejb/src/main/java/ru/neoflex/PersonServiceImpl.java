package ru.neoflex;

import ru.neoflex.domain.PersonDao.*;
import ru.neoflex.service.PersonService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;

/**
 * Created by omyag on 26.11.2017.
 */
public class PersonServiceImpl implements PersonService {
    @PersistenceContext(unitName = "employeesdb")
    EntityManager entityManager;


    @Override
    public Person createPerson(long idPerson, String namePerson, String middlenamePerson, String surnamePerson) {
        Person person = new Person();
        person.setNamePerson(namePerson);
        person.setMiddlenamePerson(middlenamePerson);
        person.setSurnamePerson(surnamePerson);
        entityManager.persist(person);
        return person;
    }

    @Override
    public List<Person> allPerson() {
        Query query =
                entityManager.createQuery("SELECT e FROM Person e");
        return query.getResultList();
    }

    @Override
    public Person merge(Person person) {
        return entityManager.merge(person);
    }

    @Override
    public Person findById(long id) {
        return entityManager.find(Person.class,id);
    }

    @Override
    public Person addChiefToPerson(long id, Chief chief) {
        Person person = findById(id);
        Chief chief1 = new Chief();
        //chief1.setTitle(title);
        return null;
    }

}
