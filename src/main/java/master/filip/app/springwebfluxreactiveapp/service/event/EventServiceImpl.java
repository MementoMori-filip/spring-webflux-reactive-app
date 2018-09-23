package master.filip.app.springwebfluxreactiveapp.service.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service("EventServiceImpl")
@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Flux<Event> listAll() {
        return eventRepository.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @Override
    public Mono<Event> getById(String id) {
        return eventRepository.findById(id);
    }

    @Override
    public Flux<Event> findByNameOfEvent(String nameOfEvent) {
        /*return eventRepository.getByName(name);*/
        return null;
    }

    @Override
    public Flux<Event> getForDate(Date dateFrom, Date dateTo) {
        /*return eventRepository.getForDate(dateFrom, dateTo);*/
        return null;
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
