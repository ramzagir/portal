package ru.neoflex.service;

import ru.neoflex.domain.PersonDao.*;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by omyag on 26.11.2017.
 */
@Local
public interface PersonService {
   Person createPerson(long idPerson,String namePerson,String middlenamePerson, String surnamePerson);
   List<Person> allPerson();
   Person merge(Person person);
   Person findById(long id);
Person addChiefToPerson(long id, Chief chief);
}
