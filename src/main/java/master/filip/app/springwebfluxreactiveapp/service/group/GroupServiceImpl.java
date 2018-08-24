package master.filip.app.springwebfluxreactiveapp.service.group;

import master.filip.app.springwebfluxreactiveapp.domain.Group;
import master.filip.app.springwebfluxreactiveapp.repository.group.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("GroupServiceImpl")
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Mono<Group> createGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Flux<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public Flux<Group> findAllByName(String name) {
        return groupRepository.findAllByNameOfGroup(name);
    }
}
