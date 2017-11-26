package ru.neoflex.domain.PersonDao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by omyag on 26.11.2017.
 */
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private String description;
    
   // private Set<Task> subTasks;
    @ManyToMany
    @JoinTable(name = "person_task",
    joinColumns = @JoinColumn(name = "task_id"),
    inverseJoinColumns = @JoinColumn(name = "person_id"))
    private Set<Person> personTask = new HashSet<Person>();
}
