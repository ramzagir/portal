package ru.neoflex.service;

import ru.neoflex.domain.PersonDao.Chief;

import java.util.List;

/**
 * Created by omyag on 26.11.2017.
 */
public interface ChiefService {
    Chief createPerson(long chief_id, String chief_title, String chief_description);
    List<Chief> allChief();
}
