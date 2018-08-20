package master.filip.app.springwebfluxreactiveapp.service.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Flux<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Mono<User> findUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public Mono<User> registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Mono<Boolean> isUserExist(User user) {
        return userRepository.existsById(user.getId());
    }
}
