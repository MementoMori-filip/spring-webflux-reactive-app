package master.filip.app.springwebfluxreactiveapp.domain;

public class Group {

    private int id;
    private String nameOfGroup;

    public Group() {
    }

    public Group(int id, String nameOfGroup) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }
}
