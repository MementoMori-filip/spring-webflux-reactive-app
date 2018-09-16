package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Objects;

@Document(collection = "company")
public class Company {

    @Id
    private String id;

    @Field(value = "name")
    private String name;

    @Field(value = "address")
    private String address;

    @Field(value = "groups")
    private List<Group> listOfGroups;

    public Company() {
    }

    public Company(String id, String name, String address, List<Group> listOfGroups) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.listOfGroups = listOfGroups;
    }

    public Company(String name, String address, List<Group> listOfGroups) {
        this.name = name;
        this.address = address;
        this.listOfGroups = listOfGroups;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Group> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(List<Group> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", listOfGroups=" + listOfGroups +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) &&
                Objects.equals(name, company.name) &&
                Objects.equals(address, company.address) &&
                Objects.equals(listOfGroups, company.listOfGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, listOfGroups);
    }
}
