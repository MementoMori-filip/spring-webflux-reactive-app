package master.filip.app.springwebfluxreactiveapp.repository.memberCustom;

import master.filip.app.springwebfluxreactiveapp.ambiguous.MemberCustom;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface MemberCustomFullRepository extends ReactiveMongoRepository<MemberCustom, String> {

    Mono<MemberCustom> findByUserUsername(String username);

}
