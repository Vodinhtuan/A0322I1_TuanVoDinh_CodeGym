package ss15_throw_exception_debug.exercise;

public class IllegalTriangleException extends Exception{
    private static final long serialVersionUID = 1L;

    String errorMessage;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    /*public IllegalRightTriangleException(String inErrorMessage) {
        errorMessage = inErrorMessage;
    }

    public String getString() {
        return errorMessage;
    }*/
}
