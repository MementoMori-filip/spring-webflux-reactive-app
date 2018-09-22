package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.domain.Company;
import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.member.MemberCustomRepository;
import master.filip.app.springwebfluxreactiveapp.repository.member.MemberRepository;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class ProfilePageController {

    private final MemberRepository memberRepository;
    private final MemberCustomRepository memberCustomRepository;

    public ProfilePageController(MemberRepository memberRepository, MemberCustomRepository memberCustomRepository) {
        super();
        this.memberRepository = memberRepository;
        this.memberCustomRepository = memberCustomRepository;
    }

    @GetMapping("/profile-page")
    public String profilePage(final Model model, @CurrentUser User user){


        final Mono<Member> specificMember = this.memberRepository.findByUser_Username(user.getUsername());

        final Mono<Member> currentMember = this.memberCustomRepository.convertSpecificMember(specificMember);

        model.addAttribute("member", specificMember);

        return "profile-page";
    }
}
