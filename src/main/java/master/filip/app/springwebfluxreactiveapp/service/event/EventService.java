package master.filip.app.springwebfluxreactiveapp.service.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

public interface EventService {

    Flux<Event> findAllEvent();

    Mono<Event> findById(int id);

    Flux<Event> findByName(String name);

    Flux<Event> findForDate(Date dateFrom, Date dateTo);

    Mono<Event> createEvent(Event event);

    Mono<Void> deleteEventById(int id);

    Mono<Void> updateEvent(Event dbEvent, Event event);
}
