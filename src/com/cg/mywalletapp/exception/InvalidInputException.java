package com.cg.mywalletapp.exception;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception {

	public InvalidInputException() {
		super();

	}

	public InvalidInputException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public InvalidInputException(String message, Throwable cause) {
		super(message, cause);

	}

	public InvalidInputException(String message) {
		super(message);

	}

	public InvalidInputException(Throwable cause) {
		super(cause);

	}

}
