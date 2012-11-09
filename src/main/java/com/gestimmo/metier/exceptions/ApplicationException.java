package com.gestimmo.metier.exceptions;

public abstract class ApplicationException extends RuntimeException {
	public ApplicationException() {
	}

	public ApplicationException(final String message) {
		super(message);
	}

	public ApplicationException(final Throwable cause) {
		super(cause);
	}

	public ApplicationException(final String message, final Throwable cause) {
		super(message, cause);
	}
}