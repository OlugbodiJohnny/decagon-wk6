package pod_d.wk6task.exceptions;

public class QuantityIsGreaterException extends RuntimeException{
    String message = "";

    public QuantityIsGreaterException (String message) {
        super(message);
    }
}
