package master.filip.app.springwebfluxreactiveapp.ambiguous;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document(collection = "membercustom")
public class MemberCustom {

    @Id
    private String id;

    @Field(value = "nameAndUsername")
    private String nameAndUsername;

    @Field(value = "email")
    private String email;

    @Field(value = "userUsername")
    private String userUsername;

    @Field(value = "userPassword")
    private String userPassword;

    @Field(value = "userRole")
    private String userRole;

    @Field(value = "groupName")
    private String groupName;

    @Field(value = "companyName")
    private String companyName;

    @Field(value = "companyAddress")
    private String companyAddress;

    public MemberCustom() {
    }

    public MemberCustom(String nameAndUsername, String email, String userUsername, String userPassword, String userRole, String groupName, String companyName, String companyAddress) {
        this.nameAndUsername = nameAndUsername;
        this.email = email;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.groupName = groupName;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameAndUsername() {
        return nameAndUsername;
    }

    public void setNameAndUsername(String nameAndUsername) {
        this.nameAndUsername = nameAndUsername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "MemberCustom{" +
                "id='" + id + '\'' +
                ", nameAndUsername='" + nameAndUsername + '\'' +
                ", email='" + email + '\'' +
                ", userUsername='" + userUsername + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRole='" + userRole + '\'' +
                ", groupName='" + groupName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberCustom that = (MemberCustom) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameAndUsername, that.nameAndUsername) &&
                Objects.equals(email, that.email) &&
                Objects.equals(userUsername, that.userUsername) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(userRole, that.userRole) &&
                Objects.equals(groupName, that.groupName) &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(companyAddress, that.companyAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameAndUsername, email, userUsername, userPassword, userRole, groupName, companyName, companyAddress);
    }
}
