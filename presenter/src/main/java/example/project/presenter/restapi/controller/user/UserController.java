package example.project.presenter.restapi.controller.user;

import example.project.entity.User;
import example.project.usecase.UseCaseExecutor;
import example.project.usecase.user.CreateNewUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class UserController implements UserGateway{
    private final UseCaseExecutor useCaseExecutor;
    private final CreateNewUserUseCase createNewUserUseCase;
    @Override
    public Mono<User> createNewUser(CreateNewUserRequest request) {
        return useCaseExecutor.execute(createNewUserUseCase,
                Mono.just(request).map(CreateNewUserRequest::toInput),
                CreateNewUserUseCase.Output::result);
    }
}
