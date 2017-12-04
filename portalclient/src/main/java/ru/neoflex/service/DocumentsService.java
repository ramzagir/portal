package ru.neoflex.service;

import ru.neoflex.domain.Documents.Documents;

import javax.ejb.Local;
import java.util.List;

@Local
public interface DocumentsService {

    /**
     * Добавляем документ в БД
     * @param value
     * @return добавлено/недобавлено
     */
    public boolean addPassport(String value);

    public boolean addMilitary(String value);

    public boolean addDiplom(String value);

    public boolean addTempPassport(String value);

    /**
     * Список документов указанного типа
     * @param typeName
     * @return Список документов
     */
    public List<Documents> showDocuments(String typeName);

    /**
     * Список типов документов
     * @return Список типов документов
     */
    public List<String> showTypeOfDocuments();

}
