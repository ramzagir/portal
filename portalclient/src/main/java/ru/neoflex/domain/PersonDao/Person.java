package ru.neoflex.domain.PersonDao;

import ru.neoflex.domain.PersonDao.Contact.AbstractContact;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by omyag on 26.11.2017.
 */
@Entity
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private long idPerson;
    @Column(name = "person_name")
    private String namePerson;
    @Column(name = "person_middle_name")
    private String middlenamePerson;
    @Column(name = "person_surname")
    private String surnamePerson;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "person_position",
            joinColumns = @JoinColumn(name="person_id"),
            inverseJoinColumns = @JoinColumn(name="position_id")
    )
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chief_id", nullable = false)
    private Chief chief;
//
//    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true)
//    Set<AbstractContact> contacts;

    /**
     * The Tasks.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "person_task",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "task_id"))
    Set<Task> tasks = new HashSet<Task>();


    /**
     * Gets id person.
     *
     * @return the id person
     */
    public long getIdPerson() {
        return idPerson;
    }

    /**
     * Sets id person.
     *
     * @param idPerson the id person
     */
    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }

    /**
     * Gets name person.
     *
     * @return the name person
     */
    public String getNamePerson() {
        return namePerson;
    }

    /**
     * Sets name person.
     *
     * @param namePerson the name person
     */
    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    /**
     * Gets middlename person.
     *
     * @return the middlename person
     */
    public String getMiddlenamePerson() {
        return middlenamePerson;
    }

    /**
     * Sets middlename person.
     *
     * @param middlenamePerson the middlename person
     */
    public void setMiddlenamePerson(String middlenamePerson) {
        this.middlenamePerson = middlenamePerson;
    }

    /**
     * Gets surname person.
     *
     * @return the surname person
     */
    public String getSurnamePerson() {
        return surnamePerson;
    }

    /**
     * Sets surname person.
     *
     * @param surnamePerson the surname person
     */
    public void setSurnamePerson(String surnamePerson) {
        this.surnamePerson = surnamePerson;
    }

    /**
     * Gets position.
     *
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets position.
     *
     * @param position the position
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * Gets department.
     *
     * @return the department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets department.
     *
     * @param department the department
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Gets chief.
     *
     * @return the chief
     */
    public Chief getChief() {
        return chief;
    }

    /**
     * Sets chief.
     *
     * @param chief the chief
     */
    public void setChief(Chief chief) {
        this.chief = chief;
    }

    /**
     * Gets tasks.
     *
     * @return the tasks
     */
    public Set<Task> getTasks() {
        return tasks;
    }

    /**
     * Sets tasks.
     *
     * @param tasks the tasks
     */
    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
