package master.filip.app.springwebfluxreactiveapp.repository.company;

import master.filip.app.springwebfluxreactiveapp.domain.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CompanyRepository extends ReactiveMongoRepository<Company, String> {
}
