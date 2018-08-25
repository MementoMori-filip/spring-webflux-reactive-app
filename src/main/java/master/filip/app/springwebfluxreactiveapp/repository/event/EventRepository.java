package master.filip.app.springwebfluxreactiveapp.repository.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.Date;

public interface EventRepository  extends ReactiveMongoRepository<Event, String>{

    Flux<Event> getByName(String name);

    Flux<Event> getForDate(Date dateFrom, Date dateTo);
}
