package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document(collection = "styleOfEvent")
public class StyleOfEvent {

    @Id
    private String id;

    @Field(value = "nameOfStyle")
    private String nameOfStyle;

    public StyleOfEvent() {
    }

    public StyleOfEvent(String id, String nameOfStyle) {
        this.id = id;
        this.nameOfStyle = nameOfStyle;
    }

    public StyleOfEvent(String nameOfStyle) {
        this.nameOfStyle = nameOfStyle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfStyle() {
        return nameOfStyle;
    }

    public void setNameOfStyle(String nameOfStyle) {
        this.nameOfStyle = nameOfStyle;
    }

    @Override
    public String toString() {
        return "StyleOfEvent{" +
                "id='" + id + '\'' +
                ", nameOfStyle='" + nameOfStyle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StyleOfEvent that = (StyleOfEvent) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameOfStyle, that.nameOfStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfStyle);
    }
}
