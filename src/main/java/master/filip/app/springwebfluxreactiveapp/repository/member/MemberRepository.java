package master.filip.app.springwebfluxreactiveapp.repository.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends ReactiveMongoRepository<Member, Integer> {
}
