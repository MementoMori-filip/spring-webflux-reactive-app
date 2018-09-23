package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.ambiguous.MemberCustom;
import master.filip.app.springwebfluxreactiveapp.domain.Member;
import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.member.MemberRepository;
import master.filip.app.springwebfluxreactiveapp.repository.memberCustom.MemberCustomFullRepository;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class ProfilePageController {

    private final MemberRepository memberRepository;
    private final MemberCustomFullRepository memberCustomFullRepository;

    public ProfilePageController(MemberRepository memberRepository, MemberCustomFullRepository memberCustomFullRepository) {
        super();
        this.memberRepository = memberRepository;
        this.memberCustomFullRepository = memberCustomFullRepository;
    }

    @GetMapping("/profile-page")
    public String profilePage(final Model model, @CurrentUser User user){

        /*final Mono<Member> specificMember = this.memberRepository.findByUser_Username(user.getUsername());*/
        final Mono<MemberCustom> memberFull = this.memberCustomFullRepository.findByUserUsername(user.getUsername());

        model.addAttribute("member", memberFull);

        return "profile-page";
    }
}
