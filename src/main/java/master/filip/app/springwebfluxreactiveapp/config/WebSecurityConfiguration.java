package master.filip.app.springwebfluxreactiveapp.config;

import master.filip.app.springwebfluxreactiveapp.common.Role;
import org.springframework.boot.actuate.autoconfigure.security.reactive.EndpointRequest;
import org.springframework.boot.autoconfigure.security.reactive.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.RedirectServerLogoutSuccessHandler;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import reactor.core.publisher.Mono;

import java.net.URI;

@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class WebSecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        return http
                .authorizeExchange()
                    .matchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                    .pathMatchers("/login-page", "/registration").permitAll()
                    .pathMatchers("/all-users").access(this::isFilip)
                    .pathMatchers("/bower_components/**", "/build/**", "/dist/**", "/documentation/**", "/plugins/**", "/pages/**").permitAll()
                    .anyExchange().authenticated()
                    .and()
                .httpBasic().and()
                .formLogin()
                    .loginPage("/login-page").and()
                .logout()
                    .logoutSuccessHandler(logoutSuccessHandler()).and()
                .build();
    }

    private Mono<AuthorizationDecision> isFilip(Mono<Authentication> authenticationMono,
                                                AuthorizationContext authorizationContext) {

        return authenticationMono
                .map(Authentication::getName)
                .map(username -> username.equals("filip"))
                .map(AuthorizationDecision::new);
    }

    @Bean
    public ServerLogoutSuccessHandler logoutSuccessHandler() {
        RedirectServerLogoutSuccessHandler logoutSuccessHandler = new RedirectServerLogoutSuccessHandler();
        logoutSuccessHandler.setLogoutSuccessUrl(URI.create("/login-page?logout"));
        return logoutSuccessHandler;
    }
}
