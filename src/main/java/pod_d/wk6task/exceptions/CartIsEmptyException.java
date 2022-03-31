package pod_d.wk6task.exceptions;

public class CartIsEmptyException extends  RuntimeException{
    String message = "";

    public CartIsEmptyException(String message){
        super(message);
    }
}
