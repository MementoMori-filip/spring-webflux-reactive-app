package master.filip.app.springwebfluxreactiveapp.security;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.service.user.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Collection;

@Component
public class ServerReactiveUserDetailsService  implements ReactiveUserDetailsService{

    private final UserService userService;

    public ServerReactiveUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return userService.getUserByUsername(username).map(CustomUserDetails::new);
    }

    static class CustomUserDetails extends User implements UserDetails{
        public CustomUserDetails(User user) {
            super(user);
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return AuthorityUtils.createAuthorityList("user", "admin");
        }

        //promeni ovaj getPassword()
        @Override
        public String getUsername() {
            return getPassword();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}
