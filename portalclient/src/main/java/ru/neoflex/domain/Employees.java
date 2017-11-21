package ru.neoflex.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table()
//@NamedQueries({@NamedQuery(name = Employees.SEARCH_ALL, query = "SELECT e FROM Employees e") })
public class Employees implements Serializable {

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column()
    private String name;

    @Column()
    private String lastname;

//    public static final String SEARCH_ALL = "Employees.SearchAllOuery";

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
