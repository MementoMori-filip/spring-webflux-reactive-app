package master.filip.app.springwebfluxreactiveapp.rest.memberCustom;

import master.filip.app.springwebfluxreactiveapp.ambiguous.MemberCustom;
import master.filip.app.springwebfluxreactiveapp.repository.memberCustom.MemberCustomFullRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/membercustom")
public class MemberCustomControllerREST {

    @Autowired
    private MemberCustomFullRepository memberCustomFullRepository;

    @GetMapping(path = "/get/{username}")
    public Mono<MemberCustom> getMemberByUser(@PathVariable String username){
        return memberCustomFullRepository.findByUserUsername(username);
    }
}
