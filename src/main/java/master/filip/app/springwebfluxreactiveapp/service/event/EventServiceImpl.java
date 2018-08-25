package master.filip.app.springwebfluxreactiveapp.service.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service("EventServiceImpl")
public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Flux<Event> listAll() {
        return eventRepository.findAll();
    }

    @Override
    public Mono<Event> getById(String id) {
        return eventRepository.findById(id);
    }

    @Override
    public Flux<Event> getByName(String name) {
        return eventRepository.getByName(name);
    }

    @Override
    public Flux<Event> getForDate(Date dateFrom, Date dateTo) {
        return eventRepository.getForDate(dateFrom, dateTo);
    }

    @Override
    public Mono<Event> saveOrUpdate(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Mono<Void> delete(Event event) {
        return eventRepository.delete(event);
    }
}
