package ru.neoflex.domain.PersonDao.Contact;

import javax.persistence.*;

/**
 * Created by omyag on 26.11.2017.
 */
@MappedSuperclass
public abstract class AbstractContact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
