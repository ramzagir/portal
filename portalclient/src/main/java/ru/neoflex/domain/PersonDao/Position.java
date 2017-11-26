package ru.neoflex.domain.PersonDao;

import javax.persistence.*;

/**
 * Created by omyag on 26.11.2017.
 */
@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private long id;
    @Column(name = "position_title")
    private String title;
    @Column(name = "position_description")
    private String description;
}
