package ru.neoflex;



import ru.neoflex.domain.Documents.Documents;
import ru.neoflex.service.DocumentsService;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class DocumentsBean implements Serializable{

    private String value;
    private String type;
    private boolean confirm = false;                // флаг для определения успешной записи в БД
    private List<SelectItem> typeItems;


    @EJB
    DocumentsService documentsService;

    // getters and setters
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SelectItem> getTypeItems() {
        typeItems = new ArrayList<SelectItem>();
        for (String t : showTypeOfDocuments()){
            typeItems.add(new SelectItem(t));
        }
        return typeItems;
    }

    // устанавливаем строковое значение для флага
    public String confirmAdd(){
        if(confirm)
            return "Добавдено!";
        else return "Введено неправильное значение!";

    }

    // добавляем документ типа указанного в поле type
    public void addDocuments(){
        if(type.equals("passport"))
            confirm = documentsService.addPassport(value);
        else if (type.equals("diplom"))
            confirm = documentsService.addDiplom(value);
        else if (type.equals("military"))
            confirm = documentsService.addMilitary(value);
        else if (type.equals("tempPassport"))
            confirm = documentsService.addTempPassport(value);
    }

    /**
     * Выводим список документов типа type
     * @return Спикок документов указанного типа
     */
    public List<Documents> showDocuments(){
        return documentsService.showDocuments(type);
    }

    /**
     * Выводим список типов документов
     * @return Список типов документов
     */
    public List<String> showTypeOfDocuments(){
        return documentsService.showTypeOfDocuments();
    }
}
