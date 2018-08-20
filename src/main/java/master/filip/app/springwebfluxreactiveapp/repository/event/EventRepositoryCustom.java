package master.filip.app.springwebfluxreactiveapp.repository.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import reactor.core.publisher.Mono;

public interface EventRepositoryCustom {

    Mono<Void> updateEvent(Event dbEvent, Event event);
}
