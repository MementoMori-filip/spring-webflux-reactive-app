package master.filip.app.springwebfluxreactiveapp.repository.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import master.filip.app.springwebfluxreactiveapp.domain.StyleOfEvent;
import master.filip.app.springwebfluxreactiveapp.domain.TypeOfEvent;
import master.filip.app.springwebfluxreactiveapp.repository.member.MemberRepository;
import master.filip.app.springwebfluxreactiveapp.repository.styleofevent.StyleOfEventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.typeofevent.TypeOfEventRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Date;

@Repository
public class EventCustomRepository {

    private final StyleOfEventRepository styleOfEventRepository;
    private final TypeOfEventRepository typeOfEventRepository;
    private final MemberRepository memberRepository;

    public EventCustomRepository(StyleOfEventRepository styleOfEventRepository, TypeOfEventRepository typeOfEventRepository, MemberRepository memberRepository) {
        this.styleOfEventRepository = styleOfEventRepository;
        this.typeOfEventRepository = typeOfEventRepository;
        this.memberRepository = memberRepository;
    }

    public Flux<Event> findAllEvents(){
        return null;
    }

    static class EventAggregator{

        private final String id;
        private final String nameOfEvent;
        private final String description;
        private final Date dateFrom;
        private final Date dateTo;
        private final String location;
        private final StyleOfEvent styleOfEvent;
        private final TypeOfEvent typeOfEvent;

        EventAggregator(String id, String nameOfEvent, String description, Date dateFrom, Date dateTo, String location, StyleOfEvent styleOfEvent, TypeOfEvent typeOfEvent) {
            this.id = id;
            this.nameOfEvent = nameOfEvent;
            this.description = description;
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
            this.location = location;
            this.styleOfEvent = styleOfEvent;
            this.typeOfEvent = typeOfEvent;
        }
    }
}
