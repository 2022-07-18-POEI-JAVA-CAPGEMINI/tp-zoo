package com.m2i.tpzoo;

public class Animal {

	
	private String nom;
	private String cri;
	
	
	public Animal() {
		
	}

	public Animal(String nom, String cri) {
		this.nom = nom;
		this.cri = cri;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getCri() {
		return cri;
	}

	public void setCri(String cri) {
		this.cri = cri;
	}

	public String pousserCri() {
		return this.cri;
	}
	
	public String toString() {	
		return "Mon nom est : "+nom + " mon cri est : "+cri;
	}
	
}
