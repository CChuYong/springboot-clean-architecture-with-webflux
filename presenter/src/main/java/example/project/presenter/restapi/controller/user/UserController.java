package example.project.presenter.restapi.controller.user;

import example.project.entity.User;
import example.project.usecase.UseCaseExecutor;
import example.project.usecase.user.CreateNewUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class UserController implements UserGateway{
    private final UseCaseExecutor useCaseExecutor;
    private final CreateNewUserUseCase createNewUserUseCase;
    @Override
    public Mono<ServerResponse> createNewUser(CreateNewUserRequest request) {
        return useCaseExecutor.execute(createNewUserUseCase,
                request.toInput(),
                output -> ServerResponse.ok().body(output.result(), User.class));
    }
}
