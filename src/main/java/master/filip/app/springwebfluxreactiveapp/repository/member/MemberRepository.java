package master.filip.app.springwebfluxreactiveapp.repository.member;

import master.filip.app.springwebfluxreactiveapp.domain.Company;
import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.domain.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;


public interface MemberRepository extends ReactiveMongoRepository<Member, String> {

    @Query
    Mono<Member> findByUser_Username(String username);

}
