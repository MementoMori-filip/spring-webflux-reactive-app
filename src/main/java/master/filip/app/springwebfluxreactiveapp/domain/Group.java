package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "group")
public class Group {

    @Id
    private String id;

    @Field(value = "nameOfGroup")
    private String nameOfGroup;

    public Group() {
    }

    public Group(String id, String nameOfGroup) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                '}';
    }
}
