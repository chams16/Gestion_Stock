package com.chams.gestionstock.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class InvalidEntityException extends RuntimeException{

    @Getter
    @Setter
    private ErrorCodes errorCodes;

    @Getter
    @Setter
    private List<String> errors;


    public InvalidEntityException(String message){
        super(message);
    }

    public InvalidEntityException(String message,Throwable cause){
        super(message,cause);
    }

    public InvalidEntityException(String message,Throwable cause, ErrorCodes errorCodes){
        super(message,cause);
        this.errorCodes=errorCodes;
    }


    public InvalidEntityException(String message, ErrorCodes errorCodesr){
        super(message);
        this.errorCodes=errorCodesr;
    }

    public InvalidEntityException(String message,ErrorCodes errorCodes,List<String> errors){
        super(message);
        this.errorCodes=errorCodes;
        this.errors=errors;
    }
}
