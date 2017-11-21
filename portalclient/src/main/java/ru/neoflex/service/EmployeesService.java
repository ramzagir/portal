package ru.neoflex.service;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import ru.neoflex.domain.Employees;

import javax.ejb.Local;
import java.util.List;

@Local
public interface EmployeesService {

    /**
     * Создает объект типа Employees
     * @param name имя создаваемого сотрудника
     * @param lastname фамилия создаваемого сотрудника
     * @return объект тпа Employees
     */
    Employees createEmployees(long id, String name, String lastname);

    /**
     *@return  список всех объектов Employees
     */
    List<Employees> allEmployees();

}
