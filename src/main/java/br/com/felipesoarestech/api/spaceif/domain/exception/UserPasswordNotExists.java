package br.com.felipesoarestech.api.spaceif.domain.exception;

public class UserPasswordNotExists extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public UserPasswordNotExists(String message){
        super(message);
    }
}