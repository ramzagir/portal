package ru.neoflex;

import ru.neoflex.domain.Employees;
import ru.neoflex.service.EmployeesService;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.swing.*;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class EmployeesBean implements Serializable {

    private Employees employees;

    @EJB
    private EmployeesService employeesService;

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public void saveEmployees(){
        employeesService.createEmployees(employees.getName(),employees.getLastname());
    }

    public List<Employees> showAllEmployees (){
        return employeesService.allEmployees();
    }

}
