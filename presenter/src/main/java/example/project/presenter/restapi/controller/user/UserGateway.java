package example.project.presenter.restapi.controller.user;

import example.project.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.EntityResponse;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public interface UserGateway {
    //TODO: CHANGE Request to Mono type...
    @PostMapping
    Mono<User> createNewUser(@RequestBody @Valid CreateNewUserRequest input);
}
