package ru.neoflex;

import ru.neoflex.domain.Conference;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ConferenceCDI implements Serializable {

    private Conference conference;
    private long id;

    private String name;

    @EJB
    ConferenceBeanImpl conferenceBean;

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

    public void createConference(){
        if(conference == null){
            conferenceBean.crearteConference(name);
        }
    }

    public List<Conference> allConference(){
        return conferenceBean.allConference();
    }
}
