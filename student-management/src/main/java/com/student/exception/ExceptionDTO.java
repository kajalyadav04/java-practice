package com.student.exception;

import java.time.LocalDateTime;

public class ExceptionDTO {
	
	private LocalDateTime timeStamp;
	
	private String message;

	public ExceptionDTO(LocalDateTime timeStamp, String message) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	


}
