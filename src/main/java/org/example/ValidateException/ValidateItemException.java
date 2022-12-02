package org.example.ValidateException;

public class ValidateItemException extends RuntimeException {
    public ValidateItemException() {
    }

    public ValidateItemException(String message) {
        super(message);
    }

    public ValidateItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidateItemException(Throwable cause) {
        super(cause);
    }

    public ValidateItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
