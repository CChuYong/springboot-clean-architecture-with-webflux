package example.project.presenter.restapi.controller.user;

import example.project.usecase.user.CreateNewUserUseCase;

public record CreateNewUserRequest(String userName, String password, String address) {
    public CreateNewUserUseCase.Input toInput() {
        return new CreateNewUserUseCase.Input(userName, password, address);
    }
}
