package com.m2i.tpzoo;

public class Chien extends Animal {
	
	public Chien(String nom) {
		super(nom, "wouaf");
	}

	
	public String pousserCri() {
		return getCri() + " " + getCri() + " " + getCri();
	}
}
