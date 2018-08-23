package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "reminder")
public class Reminder {

    @Id
    private String id;

    @Field(value = "text")
    private String text;

    @Field(value = "date")
    private Date date;

    @Field(value = "member")
    private Member member;

    public Reminder() {
    }

    public Reminder(String id, String text, Date date, Member member) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.member = member;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", member=" + member +
                '}';
    }
}
