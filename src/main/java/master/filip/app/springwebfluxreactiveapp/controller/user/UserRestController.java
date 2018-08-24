package master.filip.app.springwebfluxreactiveapp.controller.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@RestController
@RequestMapping("/private")
public class UserRestController {

/*    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Flux<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public Mono<User> createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/users/{id}")
    public Mono<ResponseEntity<User>> getUserById(@PathVariable(value="id") Integer userID){
        *//*return userRepository.findById(userID)
                .map(user -> ResponseEntity.ok(user))
                .defaultIfEmpty(ResponseEntity.notFound().build());*//*
        return null;
    }*/
}
