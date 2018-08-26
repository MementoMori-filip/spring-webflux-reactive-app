package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document(collection = "affilation")
public class Affiliation {

    @Id
    private String id;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affiliation that = (Affiliation) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(group, that.group) &&
                Objects.equals(member, that.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, group, member);
    }
}
