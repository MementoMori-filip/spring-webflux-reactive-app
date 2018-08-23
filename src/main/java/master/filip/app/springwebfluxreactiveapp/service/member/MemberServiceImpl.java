package master.filip.app.springwebfluxreactiveapp.service.member;

import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Flux<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Mono<Member> findMemberById(int id) {
        return memberRepository.findById(id);
    }

    @Override
    public Mono<Member> findMemberByNameAndSurname(String nameAndSurname) {
        return null;
    }

    @Override
    public Mono<Member> createMember(Member member) {
        return memberRepository.save(member);
    }
}
