package br.com.felipeltda.erp.finnance.domain.exception;
public class LinkedEntityException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public LinkedEntityException(String message){
        super(message);
    }
}
