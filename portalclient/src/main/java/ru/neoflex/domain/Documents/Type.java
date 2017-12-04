package ru.neoflex.domain.Documents;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Documents> typeOfDocuments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Documents> getTypeOfDocuments() {
        return typeOfDocuments;
    }

    public void setTypeOfDocuments(List<Documents> typeOfDocuments) {
        this.typeOfDocuments = typeOfDocuments;
    }

    @Override
    public boolean equals(Object obj) {
        Type t = (Type) obj;
        if(name.equals(t.getName()))
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
