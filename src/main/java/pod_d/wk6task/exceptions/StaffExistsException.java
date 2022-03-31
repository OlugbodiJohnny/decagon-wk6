package pod_d.wk6task.exceptions;

public class StaffExistsException extends RuntimeException {
    String message = "";

    public StaffExistsException (String message) {
        super(message);
    }


}
