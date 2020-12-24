package com.axis.idm.exception.handler;

import com.axis.idm.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class IdmExceptionHandler {

    @ExceptionHandler(com.axis.idm.exception.IdmException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse genericThrowable(com.axis.idm.exception.IdmException e) {
        return new ErrorResponse("500", e.message);
    }
}
