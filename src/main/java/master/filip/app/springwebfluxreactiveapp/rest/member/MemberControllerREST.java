package master.filip.app.springwebfluxreactiveapp.rest.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/member")
public class MemberControllerREST {

    @Autowired
    private MemberService memberService;

    @GetMapping(path = "/member/{uuid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Member> getMemberByUser(@PathVariable UUID uuid){
        return (Mono<Member>) memberService.getByUserUuid(uuid);
    }

    @GetMapping("/findAll")
    public Flux<Member> findAllMembers(){
        return memberService.listAll();
    }
}
