package org.howard.edu.hw5;

public class IntegerSetException extends Exception {

    private static final long serialVersionUID = 1L;

	public enum ErrorType {
        EMPTY_SET, NO_LARGEST_VALUE, NO_SMALLEST_VALUE;
    }

    private ErrorType errorType;

    public IntegerSetException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

}
