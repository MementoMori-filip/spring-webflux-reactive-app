package master.filip.app.springwebfluxreactiveapp.service.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Flux<User> findAllUsers();

    Mono<User> findUserById(int id);

    Mono<User> registerUser(User user);

    Mono<Boolean> isUserExist(User user);
}
