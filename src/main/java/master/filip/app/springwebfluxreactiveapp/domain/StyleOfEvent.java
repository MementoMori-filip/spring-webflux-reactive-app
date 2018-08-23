package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "style_of_event")
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
}
