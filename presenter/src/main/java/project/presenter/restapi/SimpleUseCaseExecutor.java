package project.presenter.restapi;

import org.springframework.stereotype.Component;
import project.usecase.GenericUseCase;
import project.usecase.UseCaseExecutor;
import java.util.function.Function;

@Component
public class SimpleUseCaseExecutor implements UseCaseExecutor {
  @Override
  public <F, T, RS> RS execute(
          GenericUseCase<F, T> executor, F input, Function<T, RS> outputMapper) {
    return outputMapper.apply(executor.execute(input));
  }
}
