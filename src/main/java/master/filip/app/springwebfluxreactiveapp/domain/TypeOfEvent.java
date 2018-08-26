package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfEvent that = (TypeOfEvent) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameOfType, that.nameOfType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfType);
    }
}
