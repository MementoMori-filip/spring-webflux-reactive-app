package master.filip.app.springwebfluxreactiveapp.service.company;

import master.filip.app.springwebfluxreactiveapp.domain.Company;
import master.filip.app.springwebfluxreactiveapp.repository.company.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Mono<Company> createCompany(Company company) {
        return companyRepository.save(company);
    }
}
