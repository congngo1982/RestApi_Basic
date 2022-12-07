/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyencongngo.controller;

import nguyencongngo.exceptionhandle.StudentErrorResponse;
import nguyencongngo.exceptionhandle.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author Admin
 */
@ControllerAdvice
public class CustomerRestExceptionHandle {
//    Add an exception handler for StudentNotFoundException

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException ex) {
//        Create Customer error response
        StudentErrorResponse error = new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());
//    return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

//    Add an Exception handler for any Exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception ex) {
//        Create Customer error response
        StudentErrorResponse error = new StudentErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), System.currentTimeMillis());
//    return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
