package master.filip.app.springwebfluxreactiveapp.domain;

public class StyleOfEvent {

    private int id;
    private String nameOfStyle;

    public StyleOfEvent() {
    }

    public StyleOfEvent(int id, String nameOfStyle) {
        this.id = id;
        this.nameOfStyle = nameOfStyle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfStyle() {
        return nameOfStyle;
    }

    public void setNameOfStyle(String nameOfStyle) {
        this.nameOfStyle = nameOfStyle;
    }
}
