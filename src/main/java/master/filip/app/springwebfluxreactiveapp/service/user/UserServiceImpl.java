package master.filip.app.springwebfluxreactiveapp.service.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("UserServiceImpl")
@PreAuthorize("hasRole('ADMIN')")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Flux<User> listAll() {
        return userRepository.findAll();
    }

    @Override
    public Mono<User> getById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Mono<User> saveOrUpdate(User user) {
        return userRepository.save(user);
    }

/*    @Override
    public Mono<Boolean> isExists(User user) {
        return userRepository.existsById(user.getId());
    }*/

    @Override
    public Mono<User> insert(User user) {
        return userRepository.insert(user);
    }

    @PreAuthorize("isAnonymous() or isAuthenticated()")
    @Override
    public Mono<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
