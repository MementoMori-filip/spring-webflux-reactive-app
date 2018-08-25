package master.filip.app.springwebfluxreactiveapp.service.group;

import master.filip.app.springwebfluxreactiveapp.domain.Group;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GroupService {

    Flux<Group> listAll();

    Flux<Group> listAllByName(String name);

    Mono<Group> saveOrUpdate(Group group);
}
