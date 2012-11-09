package com.gestimmo.metier.exceptions;

public class ApplicationMainException extends RuntimeException {
	public ApplicationMainException() {
	}

	public ApplicationMainException(final String message) {
		super(message);
	}

	public ApplicationMainException(final Throwable cause) {
		super(cause);
	}

	public ApplicationMainException(final String message, final Throwable cause) {
		super(message, cause);
	}
}