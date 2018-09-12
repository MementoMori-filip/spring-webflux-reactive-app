package master.filip.app.springwebfluxreactiveapp.controller;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.user.UserRepository;
import master.filip.app.springwebfluxreactiveapp.security.CurrentUser;
import master.filip.app.springwebfluxreactiveapp.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@Controller
public class AllUsersController {

    private final UserRepository userRepository;

    public AllUsersController(UserService userService, UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @GetMapping("/all-users")
    public String allUsersAdmin(final Model model, @CurrentUser User user){

        final Flux<User> allUsers = this.userRepository.findAll();
        model.addAttribute("allUserInfo", allUsers);

        return "all-users";
    }
}
