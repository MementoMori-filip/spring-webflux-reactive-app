package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login-page")
    public String login(Model model){
        return "login-page";
    }

    @GetMapping("/registration")
    public String registration(Model model){ return "registration"; }
}
