package master.filip.app.springwebfluxreactiveapp.domain;

import java.util.Date;

public class Event {

    private int id;
    private String nameOfEvent;
    private String description;
    private Date dateFrom;
    private Date dateTo;
    private StyleOfEvent styleOfEvent;
    private TypeOfEvent typeOfEvent;

    public Event() {
    }

    public Event(int id, String nameOfEvent, String description, Date dateFrom, Date dateTo, StyleOfEvent styleOfEvent, TypeOfEvent typeOfEvent) {
        this.id = id;
        this.nameOfEvent = nameOfEvent;
        this.description = description;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.styleOfEvent = styleOfEvent;
        this.typeOfEvent = typeOfEvent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public StyleOfEvent getStyleOfEvent() {
        return styleOfEvent;
    }

    public void setStyleOfEvent(StyleOfEvent styleOfEvent) {
        this.styleOfEvent = styleOfEvent;
    }

    public TypeOfEvent getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(TypeOfEvent typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }
}
