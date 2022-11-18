package example.project.presenter.restapi.controller.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public interface UserGateway {
    @PostMapping
    Mono<ServerResponse> createNewUser(CreateNewUserRequest input);
}
