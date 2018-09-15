package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Objects;

@Document(collection = "member")
public class Member {

    @Id
    private String id;

    @Field(value = "nameAndSurname")
    private String nameAndSurname;

    @Field(value = "email")
    private String email;

    @Field(value = "company")
    private Company company;

    @Field(value = "user")
    private User user;

    @Field(value = "groups")
    private List<Group> isMemberOfGroups;

    @Field(value = "followedevents")
    private List<Event> listOfFollowedEvents;

    @Field(value = "createdevents")
    private List<Event> listOfCreatedEvents;

    public Member() {
    }

    public Member(String id, String nameAndSurname, String email, Company company, User user, List<Group> isMemberOfGroups, List<Event> listOfFollowedEvents, List<Event> listOfCreatedEvents) {
        this.id = id;
        this.nameAndSurname = nameAndSurname;
        this.email = email;
        this.company = company;
        this.user = user;
        this.isMemberOfGroups = isMemberOfGroups;
        this.listOfFollowedEvents = listOfFollowedEvents;
        this.listOfCreatedEvents = listOfCreatedEvents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Group> getIsMemberOfGroups() {
        return isMemberOfGroups;
    }

    public void setIsMemberOfGroups(List<Group> isMemberOfGroups) {
        this.isMemberOfGroups = isMemberOfGroups;
    }

    public List<Event> getListOfFollowedEvents() {
        return listOfFollowedEvents;
    }

    public void setListOfFollowedEvents(List<Event> listOfFollowedEvents) {
        this.listOfFollowedEvents = listOfFollowedEvents;
    }

    public List<Event> getListOfCreatedEvents() {
        return listOfCreatedEvents;
    }

    public void setListOfCreatedEvents(List<Event> listOfCreatedEvents) {
        this.listOfCreatedEvents = listOfCreatedEvents;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", email='" + email + '\'' +
                ", company=" + company +
                ", user=" + user +
                ", isMemberOfGroups=" + isMemberOfGroups +
                ", listOfFollowedEvents=" + listOfFollowedEvents +
                ", listOfCreatedEvents=" + listOfCreatedEvents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) &&
                Objects.equals(nameAndSurname, member.nameAndSurname) &&
                Objects.equals(email, member.email) &&
                Objects.equals(company, member.company) &&
                Objects.equals(user, member.user) &&
                Objects.equals(isMemberOfGroups, member.isMemberOfGroups) &&
                Objects.equals(listOfFollowedEvents, member.listOfFollowedEvents) &&
                Objects.equals(listOfCreatedEvents, member.listOfCreatedEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameAndSurname, email, company, user, isMemberOfGroups, listOfFollowedEvents, listOfCreatedEvents);
    }
}
