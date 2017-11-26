package ru.neoflex.domain.PersonDao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by omyag on 26.11.2017.
 */
@Entity
@Table(name = "chief")
public class Chief {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chief_id", nullable = false, insertable = true, updatable = true)
    private long id;
    @Column(name = "chief_title")
    private String title;
    @Column(name = "chief_description")
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "chief")
    private Set<Person> person = new HashSet<Person>();

    public Chief() {
    }

    public Chief(String title, String description, Set<Person> person) {
        this.title = title;
        this.description = description;
        this.person = person;
    }

    public Chief(Chief chief){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Person> getPerson() {
        return person;
    }

    public void setPerson(Set<Person> person) {
        this.person = person;
    }
}
