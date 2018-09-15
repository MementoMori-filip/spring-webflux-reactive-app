package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Objects;

@Document(value = "group")
public class Group {

    @Id
    private String id;

    @Field(value = "nameOfGroup")
    private String nameOfGroup;

    @Field(value = "members")
    private List<Member> hasMembers;

    @Field(value = "company")
    private Company company;

    public Group() {
    }

    public Group(String id, String nameOfGroup, List<Member> hasMembers, Company company) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
        this.hasMembers = hasMembers;
        this.company = company;
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

    public List<Member> getHasMembers() {
        return hasMembers;
    }

    public void setHasMembers(List<Member> hasMembers) {
        this.hasMembers = hasMembers;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                ", hasMembers=" + hasMembers +
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id) &&
                Objects.equals(nameOfGroup, group.nameOfGroup) &&
                Objects.equals(hasMembers, group.hasMembers) &&
                Objects.equals(company, group.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfGroup, hasMembers, company);
    }
}
