package master.filip.app.springwebfluxreactiveapp.repository.event;

import master.filip.app.springwebfluxreactiveapp.domain.Event;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Date;

@Repository
public interface EventRepository extends ReactiveMongoRepository<Event, Integer> {

    Flux<Event> findByName(String name);

    Flux<Event> findForDate(Date dateFrom, Date dateTo);
}
