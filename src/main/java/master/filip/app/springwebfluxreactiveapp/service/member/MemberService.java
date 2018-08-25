package master.filip.app.springwebfluxreactiveapp.service.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MemberService {

    Flux<Member> listAll();

    Mono<Member> getById(Member member);

    Mono<Member> findMemberByNameAndSurname(Member member);

    Mono<Member> saveOrUpdate(Member member);
}
