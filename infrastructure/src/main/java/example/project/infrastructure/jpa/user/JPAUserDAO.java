package example.project.infrastructure.jpa.user;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface JPAUserDAO extends ReactiveCrudRepository<JPAUserEntity, Long> {

}
