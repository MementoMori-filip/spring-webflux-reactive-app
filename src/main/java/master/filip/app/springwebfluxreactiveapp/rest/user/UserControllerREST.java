package master.filip.app.springwebfluxreactiveapp.rest.user;

import master.filip.app.springwebfluxreactiveapp.domain.User;
import master.filip.app.springwebfluxreactiveapp.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserControllerREST {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public Flux<User> findAllUsers(){
        return userService.listAll();
    }

    @PostMapping
    public Mono<User> insertUser(@RequestBody User user){
        return userService.insert(user);
    }

    @GetMapping(path = "/get/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<User> getUserByUsername(@PathVariable String username){
        return userService.getUserByUsername(username);
    }
}
