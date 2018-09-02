package master.filip.app.springwebfluxreactiveapp.security;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.web.reactive.result.view.CsrfRequestDataValueProcessor;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.security.Principal;

@ControllerAdvice
public class SecurityControllerAdvice {

    private Mono<Principal> currentUser;

    @ModelAttribute
    Mono<CsrfToken> csrfToken(ServerWebExchange exchange) {
        Mono<CsrfToken> csrfToken = exchange.getAttribute(CsrfToken.class.getName());
        return csrfToken.doOnSuccess(token -> exchange.getAttributes()
                .put(CsrfRequestDataValueProcessor.DEFAULT_CSRF_ATTR_NAME, token));
    }

    @ModelAttribute("currentUser")
    User currentUser(@AuthenticationPrincipal User currentUser) {
        return currentUser;
    }
}
