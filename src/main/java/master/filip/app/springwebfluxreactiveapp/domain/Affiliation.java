package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "affilation")
public class Affiliation {

    @Id
    private String id;

    @DBRef
    @Field(value = "group")
    private Group group;

    @Field(value = "member")
    private Member member;

    public Affiliation() {
    }

    public Affiliation(String id, Group group, Member member) {
        this.id = id;
        this.group = group;
        this.member = member;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Affiliation{" +
                "id='" + id + '\'' +
                ", group=" + group +
                ", member=" + member +
                '}';
    }
}
