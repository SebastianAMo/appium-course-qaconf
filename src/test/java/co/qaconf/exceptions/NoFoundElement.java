package co.qaconf.exceptions;

public class NoFoundElement extends AssertionError {
    public NoFoundElement(String message, Throwable cause) {
        super(message, cause);
    }
}
