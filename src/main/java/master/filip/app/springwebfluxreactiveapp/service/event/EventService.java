package master.filip.app.springwebfluxreactiveapp.service.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

public interface EventService {

    Flux<Event> listAll();

    Mono<Event> getById(String id);

    Flux<Event> getByName(String name);

    Flux<Event> getForDate(Date dateFrom, Date dateTo);

    Mono<Event> saveOrUpdate(Event event);

    Mono<Void> delete(Event event);
}
