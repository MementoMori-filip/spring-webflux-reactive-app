package master.filip.app.springwebfluxreactiveapp.service.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MemberService {

    Flux<Member> findAll();

    Mono<Member> findMemberById(int id);

    Mono<Member> findMemberByNameAndSurname(String nameAndSurname);

    Mono<Member> createMember(Member member);
}
