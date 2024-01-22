package qreol.project.urlshortener.web.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import qreol.project.urlshortener.model.exception.IdNotFoundException
import qreol.project.urlshortener.web.dto.exception.ExceptionBody
import java.time.LocalDateTime

@RestControllerAdvice
class ControllerAdvice {

    @ExceptionHandler(IdNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleResourceNotFound(e: IdNotFoundException): ExceptionBody {
        return ExceptionBody(e.message, LocalDateTime.now())
    }

}