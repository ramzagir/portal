package ru.neoflex.domain.PersonDao;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by omyag on 26.11.2017.
 */
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false, insertable = true, updatable = true)
    private long id;
    @Column(name = "title")
    private String title;


    @Column(name = "description")
    private String description;


    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<Person> personSet;
}
