package master.filip.app.springwebfluxreactiveapp.repository.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface MemberRepository extends ReactiveMongoRepository<Member, String> {

/*    Flux<Member> findByNameAndSurname(String nameAndSurname);*/
    Mono<Member> findByUser(UUID id);
}
