public class TriangleDoesNotExistsException extends Exception {
    public TriangleDoesNotExistsException() {
    }

    public TriangleDoesNotExistsException(String message) {
        super(message);
    }

    public TriangleDoesNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TriangleDoesNotExistsException(Throwable cause) {
        super(cause);
    }

    public TriangleDoesNotExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
