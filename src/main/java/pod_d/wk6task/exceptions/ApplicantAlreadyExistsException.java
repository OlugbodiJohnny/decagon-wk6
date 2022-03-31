package pod_d.wk6task.exceptions;

public class ApplicantAlreadyExistsException extends RuntimeException{

    String message = "";

    public ApplicantAlreadyExistsException(String message){
        super(message);
    }
}
