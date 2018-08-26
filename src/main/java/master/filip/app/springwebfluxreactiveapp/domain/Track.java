package master.filip.app.springwebfluxreactiveapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(id, track.id) &&
                Objects.equals(member, track.member) &&
                Objects.equals(event, track.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, member, event);
    }
}
