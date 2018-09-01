package master.filip.app.springwebfluxreactiveapp.config;

import master.filip.app.springwebfluxreactiveapp.common.Role;
import org.springframework.boot.actuate.autoconfigure.security.reactive.EndpointRequest;
import org.springframework.boot.autoconfigure.security.reactive.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.RedirectServerLogoutSuccessHandler;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;

import java.net.URI;

@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class WebSecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    //izmeni stranice - homepage...
    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        return http
                .authorizeExchange()
                .matchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .matchers(EndpointRequest.to("calendar")).permitAll()
                .matchers(EndpointRequest.to("profile-page")).permitAll()
                .matchers(EndpointRequest.toAnyEndpoint()).hasRole(Role.ADMIN.name())
                .pathMatchers(HttpMethod.POST, "/registration").hasRole(Role.USER.name())
                .pathMatchers(HttpMethod.DELETE, "/user").hasRole(Role.USER.name())
                .pathMatchers("/users/**").hasRole(Role.ADMIN.name())
                .pathMatchers("/admin/**").hasAuthority(Role.ADMIN.name())
                .anyExchange().authenticated()
                .and()
                .httpBasic().and().formLogin().and()
                .logout().logoutSuccessHandler(logoutSuccessHandler())
                .and()
                .build();
    }

    @Bean
    public ServerLogoutSuccessHandler logoutSuccessHandler() {
        RedirectServerLogoutSuccessHandler logoutSuccessHandler = new RedirectServerLogoutSuccessHandler();
        logoutSuccessHandler.setLogoutSuccessUrl(URI.create("/login-page"));
        return logoutSuccessHandler;
    }
}
