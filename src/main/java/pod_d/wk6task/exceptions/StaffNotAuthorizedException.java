package pod_d.wk6task.exceptions;

public class StaffNotAuthorizedException extends RuntimeException{
    String message = "";

    public StaffNotAuthorizedException (String message) {
        super(message);
    }
}
