package com.chams.gestionstock.exceptions;


import lombok.Getter;
import lombok.Setter;

public class EntityNotFoundException extends RuntimeException{

    @Getter
    @Setter
    private ErrorCodes errorCodes;

    public EntityNotFoundException(String message){
        super(message);
    }

    public EntityNotFoundException(String message,Throwable cause){
        super(message,cause);
    }

    public EntityNotFoundException(String message,Throwable cause, ErrorCodes errorCodes){
        super(message,cause);
        this.errorCodes=errorCodes;
    }

    public EntityNotFoundException(String message, ErrorCodes errorCodesr){
        super(message);
        this.errorCodes=errorCodesr;
    }
}
