package master.filip.app.springwebfluxreactiveapp.repository.typeofevent;

import master.filip.app.springwebfluxreactiveapp.domain.TypeOfEvent;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TypeOfEventRepository extends ReactiveMongoRepository<TypeOfEvent, String> {
}
