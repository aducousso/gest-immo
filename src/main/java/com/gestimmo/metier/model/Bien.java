package com.gestimmo.metier.model;

public class Bien {
	private double surface;
	private char energie;
	private String adresse;
	private String codePostal;
	private String ville;
	private int nbPieces;
	public void setSurface(double surfaceDuBien) {
		surface = surfaceDuBien;
		
	}

	public double getSurface() {
		return surface;
	}

	public void setEnergie(char lettre) {
		energie = lettre;
	}

	public char getEnergie() {
		return energie;
	}

	public void setAdresse(String adresse) {
		this.adresse=adresse;
		
	}

	public String getAdresse() {
		// TODO Auto-generated method stub
		return adresse;
	}

	public void setCodePostale(String codePostal) {
		this.codePostal=codePostal;
		
	}

	public String getCodePostale() {
		// TODO Auto-generated method stub
		return codePostal;
	}

	public void setVille(String ville) {
		// TODO Auto-generated method stub
		this.ville = ville;
	}

	public String getVille() {
		// TODO Auto-generated method stub
		return ville;
	}

	public void setNbPieces(int nbPieces) {
		// TODO Auto-generated method stub
		this.nbPieces= nbPieces;
	}

	public Integer getNbPieces() {
		// TODO Auto-generated method stub
		return nbPieces;
	}
	 
	
}
