package ru.neoflex;

import ru.neoflex.domain.Documents.*;
import ru.neoflex.service.DocumentsService;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Stateless
public class DocumentsServiceImpl implements DocumentsService{

    @PersistenceContext(unitName = "employeesdb")
    EntityManager entityManager;

    @Override
    public boolean addPassport(String value){
        Pattern passportPattern = Pattern.compile("([0-9]{4}(-?| ?))([0-9]{6})");
        Matcher matcher = passportPattern.matcher(value);
        if(matcher.matches()) {
            PassportDocument doc = new PassportDocument(value);
            entityManager.persist(doc);
            return true;
        }else return false;

    }

    @Override
    public boolean addMilitary(String value){
        Pattern passportPattern = Pattern.compile("([A-Z]{2}(-?| ?))([0-9]{7})");
        Matcher matcher = passportPattern.matcher(value);

        if(matcher.matches()) {
            MilitaryDocument doc = new MilitaryDocument(value);
            entityManager.persist(doc);
            return true;
        }else return false;
    }

    public boolean addDiplom(String value){
        Pattern passportPattern = Pattern.compile("([0-9]{2}-?)([0-9]{2}-?)([0-9]{3})");
        Matcher matcher = passportPattern.matcher(value);
        if(matcher.matches()) {
            DiplomDocument doc = new DiplomDocument(value);
            entityManager.persist(doc);
            return true;
        }else return false;
    }

    @Override
    public boolean addTempPassport(String value){
        Pattern passportPattern = Pattern.compile("([0-9]{4}(-?| ?))([0-9]{6})");
        Matcher matcher = passportPattern.matcher(value);
        if(matcher.matches()) {
            TempPassportDocument doc = new TempPassportDocument(value);
            entityManager.persist(doc);
            return true;
        }else return false;
    }

    @Override
    public List<Documents> showDocuments(String typeName){
        Query query =
                entityManager.createQuery("SELECT d  FROM Documents d " +
                        "where d.type.name =:name");
        query.setParameter("name", typeName);
        return query.getResultList();
    }

    @Override
    public List<String> showTypeOfDocuments(){
        Query query =
                entityManager.createQuery("SELECT t.name  FROM Type t");
        return query.getResultList();
    }
}
