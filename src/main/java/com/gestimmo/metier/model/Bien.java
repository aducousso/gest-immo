package com.gestimmo.metier.model;

import com.gestimmo.metier.exceptions.AppliDataException;

import java.util.ArrayList;

public class Bien {

	private double surface;
	
	private char energie;
	
	private String adresse;
	private String codePostal;
	private String ville;
	
	private int tailleGarage;
	private int nbPieces;
	private int tailleVeranda;
	private int surfaceTerrasse;
	
	private boolean piscine;
	private boolean doubleVitrage;
	private boolean cheminee;

	public void setSurface(double nouveleSurface) {
		surface = nouveleSurface;
	}

	public double getSurface() {
		return surface;
	}

	public void setEnergie(char nouvelleEnergie) throws AppliDataException {
		ArrayList<String> energiesValides = new ArrayList<String>() {{add("A"); add("B"); add("C"); add("D"); add("E"); add("F"); add("G");}};

		if (!energiesValides.contains(String.valueOf(nouvelleEnergie)))
			throw new AppliDataException("Energie non valide.");
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
			throw new AppliDataException("Le nombre de pièces ne peut-être inférieur à 1.");
		nbPieces = nombreDePiece;
	}

	public Integer getNbPieces() {
		return nbPieces;
	}

	public void setGarage(int tailleGarage) {
		this.tailleGarage = tailleGarage;
		
	}

	public Integer getGarage() {
		// TODO Auto-generated method stub
		return tailleGarage;
	}

	public void setVeranda(int tailleVeranda) {
		this.tailleVeranda=tailleVeranda;
		
	}

	public Integer getVeranda() {
		// TODO Auto-generated method stub
		return tailleVeranda;
	}

	public Object getType() {
		// TODO Auto-generated method stub
		return new Object();
	}

	public void setPiscine(boolean existe) {
		this.piscine = existe;
		
	}

	public Boolean existePiscine() {
		// TODO Auto-generated method stub
		return this.piscine;
	}

	public void setDoubleVitrage(boolean existe) {
		// TODO Auto-generated method stub
		this.doubleVitrage = existe;
		
	}

	public Boolean existeDoubleVitrage() {
		// TODO Auto-generated method stub
		return this.doubleVitrage;
	}

	public void setCheminee(boolean existe) {
		// TODO Auto-generated method stub
		this.cheminee = existe;
	}

	public Boolean existeCheminee() {
		// TODO Auto-generated method stub
		return this.cheminee;
	}

	public void setTerrasse(int surface) {
		// TODO Auto-generated method stub
		this.surfaceTerrasse = surface;
	}

	public Integer getTerrasse() {
		// TODO Auto-generated method stub
		return this.surfaceTerrasse;
	}
	
}
