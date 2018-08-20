package master.filip.app.springwebfluxreactiveapp.service.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventRepositoryCustom eventRepositoryCustom;

    @Override
    public Flux<Event> findAllEvent() {
        return eventRepository.findAll();
    }

    @Override
    public Mono<Event> findById(int id) {
        return eventRepository.findById(id);
    }

    @Override
    public Flux<Event> findByName(String name) {
        return eventRepository.findByName(name);
    }

    @Override
    public Flux<Event> findForDate(Date dateFrom, Date dateTo) {
        return eventRepository.findForDate(dateFrom, dateTo);
    }

    @Override
    public Mono<Event> createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Mono<Void> deleteEventById(int id) {
        return eventRepository.deleteById(id);
    }

    @Override
    public Mono<Void> updateEvent(Event dbEvent, Event event) {
        return eventRepositoryCustom.updateEvent(dbEvent, event);
    }
}
