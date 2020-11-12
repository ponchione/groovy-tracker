package com.groovyapp.tracker.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class PartNotFoundException extends Exception{

    PartNotFoundException(String message) {
        super(message)
    }

    PartNotFoundException(String message, Throwable cause) {
        super(message, cause)
    }
}
