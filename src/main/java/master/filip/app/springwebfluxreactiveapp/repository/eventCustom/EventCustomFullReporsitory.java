package master.filip.app.springwebfluxreactiveapp.repository.eventCustom;

import master.filip.app.springwebfluxreactiveapp.ambiguous.EventCustom;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;

public interface EventCustomFullReporsitory extends ReactiveMongoRepository<EventCustom, String> {

    @Tailable
    Flux<EventCustom> findAllByCompanyName (String companyName);
}
