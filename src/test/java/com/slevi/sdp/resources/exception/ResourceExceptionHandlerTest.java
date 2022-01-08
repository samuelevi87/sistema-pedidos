package com.slevi.sdp.resources.exception;

import com.slevi.sdp.services.exceptions.DataIntegrityException;
import com.slevi.sdp.services.exceptions.ObjectNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;

class ResourceExceptionHandlerTest {
    ResourceExceptionHandler resourceExceptionHandler = new ResourceExceptionHandler();

    @Test
    void testObjectNotFound() {
        ResponseEntity<StandardError> result = resourceExceptionHandler.objectNotFound(new ObjectNotFoundException("msg", null), null);
        Assertions.assertEquals(404, result.getStatusCodeValue());
        Assertions.assertEquals(HttpStatus.NOT_FOUND, result.getStatusCode());
    }

    @Test
    void testDataIntegrity() {
        ResponseEntity<StandardError> result = resourceExceptionHandler.dataIntegrity(new DataIntegrityException("msg", null), null);
        Assertions.assertEquals(400, result.getStatusCodeValue());
        Assertions.assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
    }

}