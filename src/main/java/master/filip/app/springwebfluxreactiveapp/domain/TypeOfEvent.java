package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "typeOfEvent")
public class TypeOfEvent {

    @Id
    private String id;

    @Field(value = "nameOfType")
    private String nameOfType;

    public TypeOfEvent() {
    }

    public TypeOfEvent(String id, String nameOfType) {
        this.id = id;
        this.nameOfType = nameOfType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfType() {
        return nameOfType;
    }

    public void setNameOfType(String nameOfType) {
        this.nameOfType = nameOfType;
    }

    @Override
    public String toString() {
        return "TypeOfEvent{" +
                "id='" + id + '\'' +
                ", nameOfType='" + nameOfType + '\'' +
                '}';
    }
}
