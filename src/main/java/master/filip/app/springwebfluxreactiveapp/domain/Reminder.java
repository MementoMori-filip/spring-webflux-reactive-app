package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reminder reminder = (Reminder) o;
        return Objects.equals(id, reminder.id) &&
                Objects.equals(text, reminder.text) &&
                Objects.equals(date, reminder.date) &&
                Objects.equals(member, reminder.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, date, member);
    }
}
