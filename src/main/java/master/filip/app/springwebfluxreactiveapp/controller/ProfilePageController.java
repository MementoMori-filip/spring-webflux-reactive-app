package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import master.filip.app.springwebfluxreactiveapp.service.member.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;

@Controller
public class ProfilePageController {

    private final MemberService memberService;

    public ProfilePageController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/profile-page")
    Rendering profilePage(@CurrentUser User user){
        return Rendering.view("/profile-page")
                .modelAttribute("member", this.memberService.getByUser(user))
                .build();
    }
}
