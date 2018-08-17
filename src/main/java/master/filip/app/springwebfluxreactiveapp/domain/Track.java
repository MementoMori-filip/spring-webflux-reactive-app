package master.filip.app.springwebfluxreactiveapp.domain;

public class Track {

    private int id;
    private Member member;
    private Event event;

    public Track() {
    }

    public Track(int id, Member member, Event event) {
        this.id = id;
        this.member = member;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
