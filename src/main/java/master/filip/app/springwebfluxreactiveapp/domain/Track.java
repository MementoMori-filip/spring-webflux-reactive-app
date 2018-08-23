package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "track")
public class Track {

    @Id
    private String id;

    @Field(value = "member")
    private Member member;

    @Field(value = "event")
    private Event event;

    public Track() {
    }

    public Track(String id, Member member, Event event) {
        this.id = id;
        this.member = member;
        this.event = event;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id='" + id + '\'' +
                ", member=" + member +
                ", event=" + event +
                '}';
    }
}
