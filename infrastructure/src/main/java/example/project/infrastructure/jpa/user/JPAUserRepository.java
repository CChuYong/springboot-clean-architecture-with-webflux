package example.project.infrastructure.jpa.user;

import example.project.entity.User;
import example.project.usecase.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class JPAUserRepository implements UserRepository {
    private final JPAUserDAO repository;
    @Override
    public Mono<User> persist(User input) {
        return this.repository.save(JPAUserEntity.fromDomain(input)).map(JPAUserEntity::toDomain);
    }
}
