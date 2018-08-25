package master.filip.app.springwebfluxreactiveapp.repository.group;

import master.filip.app.springwebfluxreactiveapp.domain.Group;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface GroupRepository extends ReactiveMongoRepository<Group, String> {
}
