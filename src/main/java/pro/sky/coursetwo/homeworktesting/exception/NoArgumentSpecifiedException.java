package pro.sky.coursetwo.homeworktesting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoArgumentSpecifiedException extends RuntimeException {

    public NoArgumentSpecifiedException() {
    }

    public NoArgumentSpecifiedException(String message) {
        super(message);
    }

    public NoArgumentSpecifiedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoArgumentSpecifiedException(Throwable cause) {
        super(cause);
    }

    public NoArgumentSpecifiedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
