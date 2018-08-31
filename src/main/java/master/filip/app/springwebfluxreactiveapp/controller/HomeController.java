package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.service.user.UserService;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
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

    @GetMapping("/homepage")
    public String homepage(Model model){
        return "homepage";
    }

    @GetMapping("/registration")
    public String registration(Model model){ return "registration"; }

    @GetMapping("/profile-page")
    public String profilePage(Model model){ return "profile-page"; }
}
