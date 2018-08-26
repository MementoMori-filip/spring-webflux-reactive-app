package master.filip.app.springwebfluxreactiveapp.service.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("MemberServiceImpl")
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Flux<Member> listAll() {
        return memberRepository.findAll();
    }

    @Override
    public Mono<Member> getById(Member member) {
        return memberRepository.findById(member.getId());
    }

    @Override
    public Flux<Member> findByNameAndSurname(String nameAndSurname) {
/*        return memberRepository.findByNameAndSurname(nameAndSurname);*/
        return null;
    }

    @Override
    public Mono<Member> saveOrUpdate(Member member) {
        return memberRepository.save(member);
    }
}
