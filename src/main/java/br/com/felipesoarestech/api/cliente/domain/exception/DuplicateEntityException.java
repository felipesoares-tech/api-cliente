package br.com.felipesoarestech.api.cliente.domain.exception;
public class DuplicateEntityException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public DuplicateEntityException(String message){
        super(message);
    }
}
