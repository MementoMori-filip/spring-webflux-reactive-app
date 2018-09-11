package master.filip.app.springwebfluxreactiveapp.service.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface MemberService {

    Flux<Member> listAll();

    Mono<Member> getById(Member member);

    Flux<Member> findByNameAndSurname(String nameAndSurname);

    Mono<Member> saveOrUpdate(Member member);

    Mono<Member> getByUser(User user);

    Mono<Member> getByUserUuid(UUID uuid);
}
