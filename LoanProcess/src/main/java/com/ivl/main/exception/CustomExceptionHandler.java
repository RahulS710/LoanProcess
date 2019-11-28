package com.ivl.main.exception;

import java.time.Instant;

public class CustomExceptionHandler extends Exception {
	
	private int status;
	private String error;
	private Instant instant;
	
	public CustomExceptionHandler(Exception e) {
		this.error=e.getMessage();
		this.instant=Instant.now();
		
	}
	
	public CustomExceptionHandler() {
	}

}
