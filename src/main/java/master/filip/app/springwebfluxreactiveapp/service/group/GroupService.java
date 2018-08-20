package master.filip.app.springwebfluxreactiveapp.service.group;

import master.filip.app.springwebfluxreactiveapp.domain.Group;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GroupService {

    Mono<Group> createGroup(Group group);

    Flux<Group> findAll();

    Flux<Group> findAllByName(String name);
}
