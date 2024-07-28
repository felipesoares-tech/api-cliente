package br.com.felipesoarestech.api.spaceif.domain.exception;
import java.io.Serial;

public class EmailAlreadyExistsException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    public EmailAlreadyExistsException(String message){
        super(message);
    }
}
