package pod_d.wk6task.exceptions;

public class NoStaffToFireException extends RuntimeException{
    String message = "";

    public NoStaffToFireException (String message) {
        super(message);
    }
}
