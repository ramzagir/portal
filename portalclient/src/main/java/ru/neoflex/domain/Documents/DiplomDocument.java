package ru.neoflex.domain.Documents;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("2")
public class DiplomDocument extends Documents {

    @Column(name = "value")
    private String value;

    public DiplomDocument(){
        super();
    }

    public DiplomDocument(String value){
        super();
        this.value = value;
    }

    public String  getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
