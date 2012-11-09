package com.gestimmo.metier.model;

import com.gestimmo.metier.exceptions.AppliDataException;

public class Bien {

	private double surface;
	private char energie;
	private String adresse;
	private String codePostal;
	private String ville;
	private int nbPieces;

	public void setSurface(double nouveleSurface) {
		surface = nouveleSurface;
	}

	public double getSurface() {
		return surface;
	}

	public void setEnergie(char nouvelleEnergie) {
		energie = nouvelleEnergie;
	}

	public char getEnergie() {
		return energie;
	}

	public void setAdresse(String nouvelleAdresse) {
		adresse = nouvelleAdresse;
		
	}

	public String getAdresse() {
		return adresse;
	}

	public void setCodePostale(String nouveauCodePostal) {
		 codePostal = nouveauCodePostal;
	}

	public String getCodePostale() {
		return codePostal;
	}

	public void setVille(String nouvelleVille) {
		ville = nouvelleVille;
	}

	public String getVille() {
		return ville;
	}

	public void setNbPieces(int nombreDePiece) throws AppliDataException {
		if (nombreDePiece < 1)
			throw new AppliDataException();
		nbPieces = nombreDePiece;
	}

	public Integer getNbPieces() {
		return nbPieces;
	}
}
