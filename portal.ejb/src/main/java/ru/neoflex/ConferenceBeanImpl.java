package ru.neoflex;

import ru.neoflex.domain.Conference;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@LocalBean
public class ConferenceBeanImpl {

    @PersistenceContext(unitName = "employeesdb")
    private EntityManager entityManager;

    public List<Conference> allConference() {
        Query query =
                entityManager.createQuery("SELECT c FROM Conference c", Conference.class);
        return query.getResultList();
    }

    public Conference crearteConference(String name){
        Conference con = new Conference();
        con.setName(name);
        entityManager.persist(con);

        return con;
    }
}
