package com.gestimmo.metier.dao.exceptions;

public class DataException extends RuntimeException {
	public DataException() {
	}

	public DataException(final String message) {
		super(message);
	}

	public DataException(final Throwable cause) {
		super(cause);
	}

	public DataException(final String message, final Throwable cause) {
		super(message, cause);
	}
}