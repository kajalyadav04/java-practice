package com.student.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDTO> globalExceptionHandler(Exception ex) {
		System.out.println("inside globalExceptionHandler method...");
		ExceptionDTO dto = new ExceptionDTO(LocalDateTime.now(), ex.getMessage());
		return new ResponseEntity<ExceptionDTO>(dto, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ExceptionDTO> illegalArgument(IllegalArgumentException ex) {
		System.out.println("inside illegalArgument method...");
		ExceptionDTO dto = new ExceptionDTO(LocalDateTime.now(), ex.getMessage());
		return new ResponseEntity<ExceptionDTO>(dto, HttpStatus.BAD_REQUEST);
	}

	
}
