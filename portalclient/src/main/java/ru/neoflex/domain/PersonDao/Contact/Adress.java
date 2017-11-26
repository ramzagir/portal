package ru.neoflex.domain.PersonDao.Contact;

import javax.persistence.*;

/**
 * Created by omyag on 26.11.2017.
 */
@Entity
@Table(name = "adress")
@Inheritance(strategy = InheritanceType.JOINED)
public class Adress extends AbstractContact {
    @Column
    private String city;
    @Column
    private String zipCode;
    @Column
    private String streer;
    @Column
    private int houseNumber;
    @Column
    private int apartmentNumber;


}
