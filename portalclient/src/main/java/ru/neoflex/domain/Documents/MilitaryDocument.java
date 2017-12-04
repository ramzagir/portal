package ru.neoflex.domain.Documents;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("3")
public class MilitaryDocument extends Documents{

    @Column(name = "value")
    private String value;

    public MilitaryDocument(){
        super();
    }

    public MilitaryDocument(String value){
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
