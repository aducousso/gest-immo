package com.gestimmo.metier.exceptions;

public class AppliDataException extends ApplicationMainException {

	public AppliDataException() {
		super("Erreur: donnée invalide.");
	}

	public AppliDataException(String message) {
		super(message);
	}
}
