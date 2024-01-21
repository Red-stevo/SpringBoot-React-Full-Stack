package com.red.stevo.employee_management_system.ControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class EmptyDatasourceException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;
    public EmptyDatasourceException(String message)
    {
        super(message);
    }
}
