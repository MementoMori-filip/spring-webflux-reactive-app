package master.filip.app.springwebfluxreactiveapp.ambiguous;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.Objects;

@Document(collection = "eventcustom")
public class EventCustom {

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

    @Field(value = "location")
    private String location;

    @Field(value = "styleOfEvent")
    private String styleOfEvent;

    @Field(value = "typeOfEvent")
    private String typeOfEvent;

    @Field(value = "createdByUser")
    private String createdByUser;

    @Field(value = "companyName")
    private String companyName;

    public EventCustom() {
    }

    public EventCustom(String id, String nameOfEvent, String description, Date dateFrom, Date dateTo, String location, String styleOfEvent, String typeOfEvent, String createdByUser, String companyName) {
        this.id = id;
        this.nameOfEvent = nameOfEvent;
        this.description = description;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.location = location;
        this.styleOfEvent = styleOfEvent;
        this.typeOfEvent = typeOfEvent;
        this.createdByUser = createdByUser;
        this.companyName = companyName;
    }

    public EventCustom(String nameOfEvent, String description, Date dateFrom, Date dateTo, String location, String styleOfEvent, String typeOfEvent, String createdByUser, String companyName) {
        this.nameOfEvent = nameOfEvent;
        this.description = description;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.location = location;
        this.styleOfEvent = styleOfEvent;
        this.typeOfEvent = typeOfEvent;
        this.createdByUser = createdByUser;
        this.companyName = companyName;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStyleOfEvent() {
        return styleOfEvent;
    }

    public void setStyleOfEvent(String styleOfEvent) {
        this.styleOfEvent = styleOfEvent;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "EventCustom{" +
                "id='" + id + '\'' +
                ", nameOfEvent='" + nameOfEvent + '\'' +
                ", description='" + description + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", location='" + location + '\'' +
                ", styleOfEvent='" + styleOfEvent + '\'' +
                ", typeOfEvent='" + typeOfEvent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventCustom that = (EventCustom) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameOfEvent, that.nameOfEvent) &&
                Objects.equals(description, that.description) &&
                Objects.equals(dateFrom, that.dateFrom) &&
                Objects.equals(dateTo, that.dateTo) &&
                Objects.equals(location, that.location) &&
                Objects.equals(styleOfEvent, that.styleOfEvent) &&
                Objects.equals(typeOfEvent, that.typeOfEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfEvent, description, dateFrom, dateTo, location, styleOfEvent, typeOfEvent);
    }
}
