package master.filip.app.springwebfluxreactiveapp.repository.affiliation;

import master.filip.app.springwebfluxreactiveapp.domain.Affiliation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface AffiliationRepository extends ReactiveMongoRepository<Affiliation, String> {
}
