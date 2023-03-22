package org.example.ValidateException;

public class InvalidIndexEsception extends RuntimeException{
    public InvalidIndexEsception() {
    }

    public InvalidIndexEsception(String message) {
        super(message);
    }

    public InvalidIndexEsception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIndexEsception(Throwable cause) {
        super(cause);
    }

    public InvalidIndexEsception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
