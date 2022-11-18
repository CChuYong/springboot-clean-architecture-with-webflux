package example.project.usecase.user;

import example.project.entity.User;
import reactor.core.publisher.Mono;

public interface UserRepository {
    Mono<User> persist(User input);
}
