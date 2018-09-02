package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;

@Controller
public class HomepageController {

    @GetMapping("/homepage")
    Rendering homepage(@CurrentUser User user) {
        return Rendering.view("/homepage")
                .build();
    }
}
