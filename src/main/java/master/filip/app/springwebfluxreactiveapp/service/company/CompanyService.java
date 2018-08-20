package master.filip.app.springwebfluxreactiveapp.service.company;

import master.filip.app.springwebfluxreactiveapp.domain.Company;
import reactor.core.publisher.Mono;

public interface CompanyService {

    Mono<Company> createCompany(Company company);
}
