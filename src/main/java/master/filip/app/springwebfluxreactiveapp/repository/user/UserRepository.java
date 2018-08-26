package master.filip.app.springwebfluxreactiveapp.repository.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

    Mono<User> findByUsername(String username);
}
