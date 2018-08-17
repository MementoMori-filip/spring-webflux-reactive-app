package master.filip.app.springwebfluxreactiveapp.domain;

import java.util.Date;

public class Reminder {

    private int id;
    private String text;
    private Date date;
    private Member member;

    public Reminder() {
    }

    public Reminder(int id, String text, Date date, Member member) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
