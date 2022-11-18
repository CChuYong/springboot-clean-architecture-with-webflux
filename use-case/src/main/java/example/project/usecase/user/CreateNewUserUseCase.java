package example.project.usecase.user;

import example.project.entity.CoreException;
import example.project.entity.User;
import example.project.usecase.GenericUseCase;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CreateNewUserUseCase implements GenericUseCase<CreateNewUserUseCase.Input, CreateNewUserUseCase.Output> {
    private final UserRepository userRepository;
    private final GetUserByUserNameUseCase getUserByUserNameUseCase;
    @Override
    public Output execute(Input request) {
        User user = request.createFromInput();
        Mono<User> result = this.getUserByUserNameUseCase
                .execute(new GetUserByUserNameUseCase.Input(user.getUserName()))
                .result()
                .flatMap(__ -> Mono.error(new CoreException("User already exists")))
                .switchIfEmpty(Mono.defer(() -> this.userRepository.persist(user)))
                .onErrorMap(x-> new CoreException("Unexpected Error"))
                .cast(User.class);
        return new Output(result);
    }

    public record Input(String userName, String password, String address) {
        User createFromInput(){
            return User.create(userName, password, address, false);
        }
    }

    public record Output(Mono<User> result) { }
}
