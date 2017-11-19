package ru.neoflex;

import ru.neoflex.domain.Conference;
import ru.neoflex.domain.Employees;
import ru.neoflex.service.EmployeesService;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class EmployeesServiceImpl implements EmployeesService {

    @PersistenceContext(unitName = "employeesdb")
    EntityManager entityManager;

    @Override
    public Employees createEmployees(String name, String lastname) {
            Employees empl = new Employees();
            empl.setName(name);
            empl.setLastname(lastname);
            entityManager.persist(empl);

            return empl;
    }

    @Override
    public List<Employees> allEmployees() {
        // TypedQuery<Employees> query = entityManager.createNamedQuery(Employees.SEARCH_ALL, Employees.class);
        Query query =
                entityManager.createQuery("SELECT e FROM Employees e", Employees.class);
        return query.getResultList();
    }


}
