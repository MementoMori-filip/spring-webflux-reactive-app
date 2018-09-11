package master.filip.app.springwebfluxreactiveapp.service.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

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

    @Override
    public Mono<Member> getByUser(User user) {
        return memberRepository.findByUser(user.getId());
    }

    @Override
    public Mono<Member> getByUserUuid(UUID uuid) {
        return memberRepository.findByUser(uuid);
    }
}
