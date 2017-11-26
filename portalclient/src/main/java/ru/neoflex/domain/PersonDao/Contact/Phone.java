package ru.neoflex.domain.PersonDao.Contact;

import javax.persistence.*;

/**
 * Created by omyag on 26.11.2017.
 */
@Entity
@Table
@Inheritance(strategy= InheritanceType.JOINED)
public class Phone extends AbstractContact {
    @Column
    private int number;
    @Column
    private String description;
}
