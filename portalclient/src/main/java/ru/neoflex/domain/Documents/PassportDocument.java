package ru.neoflex.domain.Documents;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("1")
public class PassportDocument extends Documents{

    @Column(name = "value")
    private String value;

    public PassportDocument(){
        super();
    }

    public PassportDocument(String value){
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
