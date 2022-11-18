package example.project.usecase.user;

import example.project.entity.User;
import example.project.usecase.GenericUseCase;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CreateNewUserUseCase implements GenericUseCase<CreateNewUserUseCase.Input, CreateNewUserUseCase.Output> {
    private final UserRepository userRepository;
    @Override
    public Output execute(Input request) {
        return new Output(userRepository.persist(request.fromInput()));
    }

    public record Input(String userName, String password, String address) {
        User fromInput(){
            return User.create(userName, password, address, false);
        }
    }

    public record Output(Mono<User> result) { }
}
