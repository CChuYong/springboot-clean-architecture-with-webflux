package project.presenter.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.server.EntityResponse;
import project.entity.CoreException;
import reactor.core.publisher.Mono;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(CoreException.class)
    Mono<EntityResponse<APIResponse>> handleCoreException(CoreException ex) {
        return EntityResponse.fromObject(APIResponse.error(ex.getMessage())).status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
