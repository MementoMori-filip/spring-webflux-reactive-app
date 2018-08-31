package master.filip.app.springwebfluxreactiveapp.security;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.UUID;

@Component
public class DataInitializer implements CommandLineRunner {

    private static final UUID USER_IDENTIFIER = UUID.fromString("c47641ee-e63c-4c13-8cd2-1c2490aee0b3");
    private static final UUID USER_IDENTIFIER1 = UUID.fromString("40c5ad0d-41f7-494b-8157-33fad16012aa");
    private static final UUID USER_IDENTIFIER2 = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
    private static final UUID ADMIN_IDENTIFIER = UUID.fromString("0d2c04f1-e25f-41b5-b4cd-3566a081200f");

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        createUsers();
    }

    private void createUsers() {
        final Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("Creating users with USER and ADMIN roles");

        userRepository.save(
                new User(ADMIN_IDENTIFIER, "filip", passwordEncoder.encode("filip94"), "admin")
        ).subscribe();

        userRepository.save(
                new User(USER_IDENTIFIER1, "dule", passwordEncoder.encode("dulesavic"), "user")
        ).subscribe();

        userRepository.save(
                new User(USER_IDENTIFIER2, "milos", passwordEncoder.encode("mm"), "user")
        ).subscribe();

        userRepository.save(
                new User(USER_IDENTIFIER, "nikola", passwordEncoder.encode("n94"), "user")
        ).subscribe();

        Flux<User> users = userRepository.findAll();
        users.delaySubscription(Duration.ofMillis(100)).subscribe(
                u -> logger.info("User '{}' created with id '{}'", u.getId())
        );
    }
}