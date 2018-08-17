package master.filip.app.springwebfluxreactiveapp.domain;

public class Member {

    private int id;
    private String nameAndSurname;
    private String email;
    private Company company;

    public Member() {
    }

    public Member(int id, String nameAndSurname, String email, Company company) {
        this.id = id;
        this.nameAndSurname = nameAndSurname;
        this.email = email;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
