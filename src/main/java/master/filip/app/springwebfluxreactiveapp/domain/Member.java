package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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

    public Member() {
    }

    public Member(String id, String nameAndSurname, String email, Company company, User user) {
        this.id = id;
        this.nameAndSurname = nameAndSurname;
        this.email = email;
        this.company = company;
        this.user = user;
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

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", email='" + email + '\'' +
                ", company=" + company +
                ", user=" + user +
                '}';
    }
}
