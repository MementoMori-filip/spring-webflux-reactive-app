package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "event")
public class Event {

    @Id
    private String id;

    @Field(value = "nameOfEvent")
    private String nameOfEvent;

    @Field(value = "description")
    private String description;

    @Field(value = "dateFrom")
    private Date dateFrom;

    @Field(value = "dateTo")
    private Date dateTo;

    @Field(value = "styleOfEvent")
    private StyleOfEvent styleOfEvent;

    @Field(value = "typeOfEvent")
    private TypeOfEvent typeOfEvent;

    public Event() {
    }

    public Event(String id, String nameOfEvent, String description, Date dateFrom, Date dateTo, StyleOfEvent styleOfEvent, TypeOfEvent typeOfEvent) {
        this.id = id;
        this.nameOfEvent = nameOfEvent;
        this.description = description;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.styleOfEvent = styleOfEvent;
        this.typeOfEvent = typeOfEvent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", nameOfEvent='" + nameOfEvent + '\'' +
                ", description='" + description + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", styleOfEvent=" + styleOfEvent +
                ", typeOfEvent=" + typeOfEvent +
                '}';
    }
}
