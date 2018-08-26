package master.filip.app.springwebfluxreactiveapp.repository.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EventRepository  extends ReactiveMongoRepository<Event, String>{

    Flux<Event> findByNameOfEvent(String nameOfEvent);
}
