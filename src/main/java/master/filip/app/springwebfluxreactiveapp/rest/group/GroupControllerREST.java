package master.filip.app.springwebfluxreactiveapp.rest.group;

import master.filip.app.springwebfluxreactiveapp.domain.Group;
import master.filip.app.springwebfluxreactiveapp.repository.group.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/group")
public class GroupControllerREST {

    @Autowired
    private GroupRepository groupRepository;

    @GetMapping(value = "/findAll")
    public Flux<Group> findAllMembers(){
        return groupRepository.findAll();
    }
}
