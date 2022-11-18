package example.project;

import example.project.usecase.user.CreateNewUserUseCase;
import example.project.usecase.user.GetUserByUserNameUseCase;
import example.project.usecase.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseImplementer {
    @Bean
    public GetUserByUserNameUseCase getUserByUserNameUseCase(UserRepository userRepository){
        return new GetUserByUserNameUseCase(userRepository);
    }
    @Bean
    public CreateNewUserUseCase createNewUserUseCase(UserRepository userRepository, GetUserByUserNameUseCase getUserByUserNameUseCase) {
        return new CreateNewUserUseCase(userRepository, getUserByUserNameUseCase);
    }
}
