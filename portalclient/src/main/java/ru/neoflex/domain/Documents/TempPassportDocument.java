package ru.neoflex.domain.Documents;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("4")
public class TempPassportDocument extends Documents{

    @Column(name = "value")
    private String value;

    public TempPassportDocument() {
        super();
    }

    public TempPassportDocument(String value) {
        super();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
