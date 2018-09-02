package master.filip.app.springwebfluxreactiveapp.security;

import master.filip.app.springwebfluxreactiveapp.service.user.UserService;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ServerReactiveUserDetailsService  implements ReactiveUserDetailsService{

    private final UserService userService;

    public ServerReactiveUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return userService.getUserByUsername(username).map(ServerUser::new);
    }
}
