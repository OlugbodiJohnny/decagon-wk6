package pod_d.wk6task.exceptions;

public class PurchaseCouldNotBeValidatedException extends RuntimeException{
    String message = "";

    public PurchaseCouldNotBeValidatedException (String message) {
        super(message);
    }
}
