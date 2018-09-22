package master.filip.app.springwebfluxreactiveapp.repository.member;

import master.filip.app.springwebfluxreactiveapp.domain.*;
import master.filip.app.springwebfluxreactiveapp.repository.company.CompanyRepository;
import master.filip.app.springwebfluxreactiveapp.repository.event.EventRepository;
import master.filip.app.springwebfluxreactiveapp.repository.group.GroupRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberCustomRepository {

    private final CompanyRepository companyRepository;
    private final GroupRepository groupRepository;
    private final EventRepository eventRepository;

    public MemberCustomRepository(CompanyRepository companyRepository, GroupRepository groupRepository, EventRepository eventRepository) {
        super();
        this.companyRepository = companyRepository;
        this.groupRepository = groupRepository;
        this.eventRepository = eventRepository;
    }

    public Mono<Member> convertSpecificMember(Mono<Member> specificMember) {
        return null;
    }

    static class MemberAggregator{

        private final String id;
        private final String nameAndSurname;
        private final String email;
        private final User user;
        private final Group group;
        private final Company company;

        MemberAggregator(final User user, final Group group, final Company company) {
            super();
            this.id = "";
            this.nameAndSurname = "";
            this.email = "";
            this.user = user;
            this.group = group;
            this.company = company;
        }
    }
}
