package master.filip.app.springwebfluxreactiveapp.repository.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
