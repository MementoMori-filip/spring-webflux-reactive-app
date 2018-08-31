package master.filip.app.springwebfluxreactiveapp.service.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Flux<User> listAll();

    Mono<User> getById(String id);

    Mono<User> saveOrUpdate(User user);

/*    Mono<Boolean> isExists(User user);*/

    Mono<User> insert(User user);

    //za testiranje
    Mono<User> getUserByUsername (String username);
}
