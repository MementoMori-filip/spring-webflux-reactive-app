package master.filip.app.springwebfluxreactiveapp.domain;

public class Affiliation {

    private int id;
    private Group group;
    private Member member;

    public Affiliation() {
    }

    public Affiliation(int id, Group group, Member member) {
        this.id = id;
        this.group = group;
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
