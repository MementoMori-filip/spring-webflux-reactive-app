package master.filip.app.springwebfluxreactiveapp.service.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.user.UserRepository;
import master.filip.app.springwebfluxreactiveapp.repository.user.UserTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService{

/*    @Autowired
    private UserRepository userRepository;*/

    @Override
    public Flux<User> findAllUsers() {
        /*return userRepository.findAll();*/
        return null;
    }

    @Override
    public Mono<User> findUserById(String id) {
        /*return userRepository.findById(id);*/
        return null;
    }

    @Override
    public Mono<User> registerUser(User user) {
        /*return userRepository.save(user);*/
        return null;
    }

    @Override
    public Mono<Boolean> isUserExist(User user) {
        /*return userRepository.existsById(user.getId());*/
        return null;
    }

    @Override
    public Mono<User> insertUser(User user) {
        /*return userRepository.save(user);*/
        return null;
    }
}
