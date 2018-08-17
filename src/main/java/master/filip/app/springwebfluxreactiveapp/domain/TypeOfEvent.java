package master.filip.app.springwebfluxreactiveapp.domain;

public class TypeOfEvent {

    private int id;
    private String nameOfType;

    public TypeOfEvent() {
    }

    public TypeOfEvent(int id, String nameOfType) {
        this.id = id;
        this.nameOfType = nameOfType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfType() {
        return nameOfType;
    }

    public void setNameOfType(String nameOfType) {
        this.nameOfType = nameOfType;
    }
}
